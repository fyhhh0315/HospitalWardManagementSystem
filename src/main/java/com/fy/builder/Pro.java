package com.fy.builder;

import com.fy.mapper.base.PatientBaseMapper;
import com.fy.mapper.base.prescriptionsBaseMapper;

public class Pro {
    private  static prescriptionsBaseMapper aa;
    public static  void Init(){
        aa  = SqlSessionBuilder.getSqlSession().getMapper(prescriptionsBaseMapper.class);
    }
    public static prescriptionsBaseMapper getPatientBaseMapper(){
        return  aa;
    }

}
