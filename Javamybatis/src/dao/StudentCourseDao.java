package dao;

import java.util.List;
import java.util.Map;

import vo.StudentCourse;

public interface StudentCourseDao {
    int deleteByPrimaryKey(Long id);

    int insert(StudentCourse record);

    int insertSelective(StudentCourse record);

    StudentCourse selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StudentCourse record);

    int updateByPrimaryKey(StudentCourse record);
    
    
                //查询所有的学生选课
	 
	List<Map<String, Object>> selectAllStudentCourse();
	
	//分页查询所有的学生选课
	
	Map<String, Object> selectAllStudentCourse(int pageNum,int pageSize,String whereSql);
	
	// 批量删除学生选课
	
	boolean deleteByPrimaryKeys(String ids);

	//查询学生选课的数量
	
	Map<String, Object> selectStudentCourseNumber();

	// 查询该学生选课是否存在
	
	Map<String, Object> selectOneByCourseId(long studentId, long courseid);

	//添加成绩
	 
	boolean addGrade(int grade, long studentId, long courseid);

	//学生查询课表
	 
	Map<String, Object> studentSchedule(int pageNum, int pageSize, String whereSql);


}