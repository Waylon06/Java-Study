package com.dms;

import com.dms.Account;
import com.dms.utils.Mapper;
import com.dms.utils.MybatisUtils;
import lombok.val;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test01 {
    @Test
    public void test01() throws IOException {
//        1.读取全局配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
//        2.获取SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
//        3.获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
//        4.通过SqlSession实现数据库操作
        List<Account> list = sqlSession.selectList("com.dms.Account.all");
        for (Account account : list){
            System.out.println(account);
        }
        sqlSession.close();
    }
    @Test
    public void test2()
    {
        SqlSession sqlSession= MybatisUtils.getsqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);
        List<Account> findall = mapper.findall();
        System.out.println(findall);
    }
}
