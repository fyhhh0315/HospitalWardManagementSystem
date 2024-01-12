package com.fy.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.fy.bean.Department;
/**
*  @author fy
*/
public interface DepartmentBaseMapper {

    int insertDepartment(Department object);

    int updateDepartment(Department object);

    int update(Department.UpdateBuilder object);

    List<Department> queryDepartment(Department object);

    Department queryDepartmentLimit1(Department object);

}