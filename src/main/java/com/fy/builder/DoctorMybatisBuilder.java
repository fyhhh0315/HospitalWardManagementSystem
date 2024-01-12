package com.fy.builder;

import com.fy.mapper.base.DoctorBaseMapper;

public class DoctorMybatisBuilder {
    private  static DoctorBaseMapper doctorBaseMapper ;
    public static  void Init(){
        doctorBaseMapper  = SqlSessionBuilder.getSqlSession().getMapper(DoctorBaseMapper.class);
    }
    public static DoctorBaseMapper getDoctorBaseMapper(){
        return  doctorBaseMapper;
    }
}
