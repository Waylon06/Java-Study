package com.waylon.mybatis.test;

import com.waylon.mybatis.mapper.UserMapper;
import com.waylon.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testMyBatis() throws IOException {
//        加载核心文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//        获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
//        获取mapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        测试功能
        int result = mapper.insertUser();
        /**
         * SqlSession默认不自动提交事务，若需要自动提交事务
         * 可以使用SqlSessionFactory.openSession(true);
         */
//        //提交事务
//        sqlSession.commit();
        System.out.println("result:" + result);
    }

    @Test
    public void testUpdate() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser();
    }

    @Test
    public void testDeleteUser() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser();
    }

    @Test
    public void testGetUserById() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
    }

    @Test
    public void testGetAllUser() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = mapper.getAllUser();
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++ ){
//            System.out.println(list);
//        }
        list.forEach(user -> System.out.println(user));
    }
}
