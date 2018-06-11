package smart.demo.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import smart.demo.bean.ResponseResult;
import smart.demo.bean.User;
import smart.demo.service.UserService;
import smart.demo.service.ex.DataNotFoundException;
import smart.demo.service.ex.PasswordNotMatchException;
import smart.demo.service.ex.phoneAlreadyExistException;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/showRegister.do")
	public String showRegister(){
		
		return "register";
	}
	
	@RequestMapping("showIndex.do")
	public String showIndex() {
		
		return "index";
	}
	
	@RequestMapping("showLogin.do")
	public String showLogin() {
		
		return "login";
	}
	
	@RequestMapping("/checkUser.do")
	@ResponseBody
	public ResponseResult<Void> checkUser(String phone){
		ResponseResult<Void> rr;
		//�������true,��ʾ�û�������,
		//�������false,��ʾ�û���������
		if(userService.checkUserByPhone(phone)){
			rr = new ResponseResult<Void>(1,"用户已存在");
		}else{
			rr = new ResponseResult<Void>(0,"该用户可以使用");
		}
		return rr;
	}
	@RequestMapping(value="/register.do",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Void> register(@RequestParam("uname")String userName,
			@RequestParam("pdws")String passWord,String phone){
		
		ResponseResult<Void> rr;
		
		try{
				User user = new User();
				user.setUserName(userName);
				user.setPassWord(passWord);
				user.setPhone(phone);
				
				userService.register(user);
				
				rr = new ResponseResult<Void>(0,"注册成功");
			    
			}catch(phoneAlreadyExistException e){
				
				rr = new ResponseResult<Void>(1,"注册失败，用户已存在");
			}
				
				return rr;
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	@ResponseBody
	public ResponseResult<Void> login(String phone,String passWord,HttpSession session){
		ResponseResult<Void>  rr = null;
		
		try{
			
			if(userService.login(phone, passWord)!=null){
				
				rr = new ResponseResult<Void>(1,"登陆成功");
				session.setAttribute("user", userService.login(phone, passWord));
				
			}
			
		}catch(PasswordNotMatchException e){
			
			rr = new ResponseResult<Void>(0,e.getMessage());
			
		}catch(DataNotFoundException e){
			rr = new ResponseResult<Void>(-1,e.getMessage()); 
		}
		    return rr;
	}
	
}
