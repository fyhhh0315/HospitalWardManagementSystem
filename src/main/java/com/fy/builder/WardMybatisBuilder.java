package com.fy.builder;

import com.fy.mapper.base.WardBaseMapper;

public class WardMybatisBuilder {
    private  static WardBaseMapper wardBaseMapper ;
    public static  void Init(){
        wardBaseMapper  = SqlSessionBuilder.getSqlSession().getMapper(WardBaseMapper.class);
    }
    public static WardBaseMapper getWardBaseMapper(){
        return  wardBaseMapper;
    }
}
