package service;

import java.util.List;
import java.util.Map;

import vo.TeacherCourse;

public interface TeacherCourseService {
	//查询所有的课程
	
	public List<Map<String, Object>> selectAllTeacherCourse();
	//查询所有的课程
	 
	public List<Map<String, Object>> selectAllTeacherCourse(int pageNum,int pageSize);
	
	//查询课程数量
	 
	Map<String, Object> selectTeacherCourseNumber();
	
	//根据id查询课程
	
	public TeacherCourse selectOne(long id);
	//修改课程的信息
	
	public boolean updateById(TeacherCourse teacherCourse);
	//根据id删除课程
	 
	public boolean deleteById(long id);

	// 根据id批量删除课程
	 
	public boolean deleteByIds(String id);

	// 添加课程
	 
	public boolean addTeacherCourse(TeacherCourse teacherCourse);
	
	//查询该课程是否存在
	
	public Map<String, Object>  selectOneByCourseId(long id);

}
