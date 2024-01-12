package com.fy.builder;

import com.fy.mapper.base.PatientBaseMapper;

public class PatientMybatisBuilder {
    private  static PatientBaseMapper patientBaseMapper ;
    public static  void Init(){
        patientBaseMapper  = SqlSessionBuilder.getSqlSession().getMapper(PatientBaseMapper.class);
    }
    public static PatientBaseMapper getPatientBaseMapper(){
        return  patientBaseMapper;
    }
}
