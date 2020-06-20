package service;

import java.util.List;
import java.util.Map;

import vo.User;

public interface UserService {
	public List<Map<String, Object>> studentsCourseSelection(long courseId);
	
	//根据学号查询该用户是否存在
	 
	
	public String selectUserByUserNumber(long userNumber);
	
	
	//验证信息
	 
	public Map<String, Object> verifyByUser(User user);

	//修改密码
	
	public boolean updatePwd(Map<String,Object> map);
		
	//修改用户信息
	 
	public boolean updateUserById(User user);
	
	//添加用户
	 
	public boolean addUser(User user);
	
	// 查询所有的用户
	
	public List<Map<String, Object>> selectAllUser();
	
	//分页查询所有的用户
	
	public Map<String, Object> selectAllUser(int pageNum,int pageSize,Map<String, Object> paramMap);
	
	//查询用户的数量
	 	Map<String, Object> selectUserNumber();
	// 根据id查询用户
	 
	public User selectOne(long id);
	// 修改用户的信息
	 
	public boolean updateById(User user);
	//根据id删除用户
	 
	public boolean deleteById(long id);

	//根据id批量删除用户
	
	public boolean deleteByIds(String id);
	
	//根据用户角色获取该角色的所有的用户
	 
	List<Map<String, Object>> selectAllUserByIdentity(int identity);
               //根据学号查询用户
	 
	Map<String, Object> selectOneByUserNumber(long userNumber);
}
