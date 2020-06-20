package service;

import java.util.List;
import java.util.Map;

import vo.StudentCourse;

public interface StudentCourseService {
	
	//添加学生选课
	
	public boolean addStudentCourse(StudentCourse studentCourse);
	
	//查询所有的学生选课
	
	public List<Map<String, Object>> selectAllStudentCourse();

	//分页查询所有的学生选课
	 
	public Map<String, Object> selectAllStudentCourse(int pageNum,int pageSize,Map<String, Object> paramMap);
	
	
	//根据id查询学生选课
	 
	public StudentCourse selectOne(long id);

	//修改学生选课的信息
	
	public boolean updateById(StudentCourse studentCourse);

	// 根据id删除学生选课
	 
	public boolean deleteById(long id, long courseId);

	//根据id批量删除学生选课
	 
	public boolean deleteByIds(String id);

	//根据课程id查询是否存在
	
	boolean selectOneByCourserId(long studentId, long courseid);

	//批量添加成绩
	
	public boolean addGrade(List<Map<String, Object>> listMap);

	//学生课表
	 
	public Map<String, Object> studentSchedule(int pageNum, int pageSize, String start, String end, long studentId);
	
}
