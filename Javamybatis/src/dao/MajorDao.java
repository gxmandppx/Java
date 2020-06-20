package dao;

import java.util.List;
import java.util.Map;

import vo.Major;

public interface MajorDao {
    int deleteByPrimaryKey(Long id);

    int insert(Major record);

    int insertSelective(Major record);

    Major selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);

	//查询所有的专业
	
	List<Map<String, Object>> selectAllMajor();
	
	//分页查询所有的专业
	
	List<Map<String, Object>> selectAllMajor(int pageNum,int pageSize);
	
	//批量删除专业
	
	boolean deleteByPrimaryKeys(String ids);

	//查询专业的数量
	
	Map<String, Object> selectMajorNumber();
}