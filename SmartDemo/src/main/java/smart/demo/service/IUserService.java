package smart.demo.service;

import smart.demo.bean.User;

public interface IUserService {

	/**
	 * 用户注册
	 * @param user 需要注册的用户信息
	 * @return 返回注册的结果（数据库被影响行数）
	 */
	Integer register(User user);
	
	/**
	 * 查询用户（手机号）是否存在
	 * @param phone 被查询的账户
	 * @return 返回查询结果 ：   存在/不存在(true/false)
	 */
	boolean checkUserByPhone(String phone);
	
	
	/**
	 * 用户登陆
	 * @param phone 手机号
	 * @param password 用户密码
	 * @return 返回用户信息
	 */
	User  login(String phone,String passWord);
}
