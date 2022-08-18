package com.dms.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    public SqlSession sqlSession=null;
    static
    {
        try {
            InputStream in= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
            sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getsqlSession()
    {
       return getsqlSession();
    }
    public void Close()
    {
        sqlSession.close();
    }
}
