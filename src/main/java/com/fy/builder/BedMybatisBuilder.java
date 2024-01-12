package com.fy.builder;

import com.fy.mapper.base.BedBaseMapper;

public class BedMybatisBuilder {
    private  static BedBaseMapper bedBaseMapper ;
    public static  void Init(){
        bedBaseMapper  = SqlSessionBuilder.getSqlSession().getMapper(BedBaseMapper.class);
    }
    public static BedBaseMapper getBedBaseMapper(){
        return  bedBaseMapper;
    }
}
