package com.waylon.dms.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Mybatis {
    //    创建SqlSessionFactory对象
    private static SqlSessionFactory factory;

    static {
        try {
            //        加载核心文件
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //        获取SqlSessionFactoryBuilder
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            //        获取SqlSessionFactory
            factory = sqlSessionFactoryBuilder.build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = factory.openSession(true);
        return sqlSession;
    }

}
