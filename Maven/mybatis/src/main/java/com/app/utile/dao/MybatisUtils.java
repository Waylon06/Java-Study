package com.app.utile.dao;

;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    public static SqlSession sqlSession=null;
    static
    {
        try {
            InputStream is= Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
            sqlSession=sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getsqlSession()
    {
        return  sqlSession;
    }
    public void close()
    {
        sqlSession.close();
    }

}
