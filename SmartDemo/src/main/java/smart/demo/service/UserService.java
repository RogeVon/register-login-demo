package smart.demo.service;


import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import smart.demo.service.ex.DataNotFoundException;
import smart.demo.service.ex.PasswordNotMatchException;
import smart.demo.service.ex.phoneAlreadyExistException;
import smart.demo.bean.ResponseResult;
import smart.demo.bean.User;
import smart.demo.mapper.UserMapper;

@Service
public class UserService implements IUserService{

	@Resource
	private UserMapper userMapper;

	
		
		public Integer register(User user) {
			
			if(userMapper.getUserByPhone(user.getPhone())!=null){
				
				throw new phoneAlreadyExistException("用户已存在");
				
			}else{
				
				return userMapper.insert(user);
				
			}
			 
		}
	

  public User login(String phone, String passWord) {
		
	  User user = userMapper.getUserByPhone(phone);
	  
		if(user!=null){
			
				if(user.getPassWord().equals(passWord)){
					
					 return user;
					
				}else{
					
					throw new PasswordNotMatchException("密码不正确");
				}
			
		}else{
			
			 throw new DataNotFoundException("用户不存在");
		}
		
	}


	public boolean checkUserByPhone(String phone) {
		
		if(userMapper.getUserByPhone(phone)!=null) {
			
			return true;
		}else {
			return false;
		}
		
	}
}
