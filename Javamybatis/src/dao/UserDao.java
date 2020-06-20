package dao;

import java.util.List;
import java.util.Map;

import vo.User;

public interface UserDao {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	List<Map<String, Object>> studentsCourseSelection(long courseId);
	
	// 根据学号查询该用户是否存在
	
	public String selectUserByUserNumber(long userNumber);
	
	//验证登录信息
	
	public Map<String, Object> verifyByUser(long userNumber, String password, int identity);

	// 修改密码
	
	boolean updatePwd(long id, String password);
	
	
	
	//查询所有的用户
	
	List<Map<String, Object>> selectAllUser();
	
	//分页查询所有的用户
	 
	Map<String, Object> selectAllUser(int pageNum,int pageSize,String whereSql);
	
	//批量删除用户
	
	boolean deleteByPrimaryKeys(String ids);

	//查询用户的数量
	 
	Map<String, Object> selectUserNumber();

	//根据用户角色获取该角色的所有的用户
	
	List<Map<String, Object>> selectAllUserByIdentity(int identity);

	//老师根据条件查询学生列表
	
	Map<String, Object> selectUserByTeacher(int pageNum, int pageSize, String whereSql);


	Map<String, Object> selectAllStudent(int pageNum, int pageSize, String whereSql);

	//根据学号查询用户
	
	Map<String, Object> selectOneByUserNumber(long userNumber);

	// 根据学生id修改学分
	 
	boolean updateCreditById(long id, int credit);
	
}