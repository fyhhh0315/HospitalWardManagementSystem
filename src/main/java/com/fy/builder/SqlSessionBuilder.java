package com.fy.builder;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class SqlSessionBuilder {
    private static  SqlSession sqlSession;

    public static void Init(SqlSessionFactory sqlSessionFactory) {

        sqlSession = sqlSessionFactory.openSession();
        BedMybatisBuilder.Init();
        DepartmentMybatisBuilder.Init();
        DoctorMybatisBuilder.Init();
        PatientMybatisBuilder.Init();
        WardMybatisBuilder.Init();
        Pro.Init();

    }
    static  SqlSession getSqlSession(){
        return sqlSession;
    }

}
