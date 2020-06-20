package dao;

import java.util.List;
import java.util.Map;

import vo.Course;

public interface CourseDao {
    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    

	//根据学号查询该课程是否存在

	public String selectCourseByCourseNumber(long courseNumber);
	
	//查询所有的课程

	
	List<Map<String, Object>> selectAllCourse();
	

	 //分页查询所有的课程
	Map<String, Object> selectAllCourse(int pageNum,int pageSize,String whereSql);
	
	//批量删除课程
	
	boolean deleteByPrimaryKeys(String ids);

	//查询课程的数量

	Map<String, Object> selectCourseNumber();
	//	根据老师id查询课程
	
	List<Map<String, Object>> selectCourseByTeacherId(long teacherId);
	
	//学生选课
	
	Map<String, Object> selectAllCourseByStudent(int pageNum, int pageSize, String whereSql, String studentId);
	
	// 修改剩余可选人数
	
	public boolean updateSpacePerson(int flag, long courseId);
}