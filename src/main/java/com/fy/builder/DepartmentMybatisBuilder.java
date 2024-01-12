package com.fy.builder;

import com.fy.mapper.DepartmentMapper;
import com.fy.mapper.base.BedBaseMapper;
import com.fy.mapper.base.DepartmentBaseMapper;

public class DepartmentMybatisBuilder {
    private  static DepartmentBaseMapper departmentBaseMapper ;
    public static  void Init(){
        departmentBaseMapper  = SqlSessionBuilder.getSqlSession().getMapper(DepartmentBaseMapper.class);
    }
    public static DepartmentBaseMapper getBedBaseMapper(){
        return  departmentBaseMapper;
    }
}
