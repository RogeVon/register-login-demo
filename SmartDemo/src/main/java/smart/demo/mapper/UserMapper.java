package smart.demo.mapper;

import smart.demo.bean.User;

public interface UserMapper {
	
	/**
	 * 添加用户信息(用户注册)
	 * @param user 用户信息
	 */
	public Integer insert(User user) ;

	/**
	 * 通过手机号查询用户信息
	 * @param phone 被查询手机号
	 * @return 返回查询到的用户信息
	 */
	User getUserByPhone(String phone) ;

	
	

	

}
