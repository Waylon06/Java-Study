package com.waylon.dms.mapper;

import com.alibaba.fastjson.JSON;
import com.waylon.dms.Student;
import com.waylon.dms.dao.Mybatis;
import org.apache.ibatis.session.SqlSession;
import org.jcp.xml.dsig.internal.dom.ApacheCanonicalizer;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
@Test
    public void testInsert() throws IOException {
    SqlSession sqlSession = Mybatis.getSqlSession();
    StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
    mapper.insertStudent();
    sqlSession.close();
}

    @Test
    public void testSearchAll() throws IOException {
        SqlSession sqlSession = Mybatis.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> allStudent = mapper.getAllStudent();
        String s = JSON.toJSONString(allStudent);
//        Object o = JSON.toJSON(allStudent);
//        System.out.println(o);
        sqlSession.close();
    }

    @Test
    public void testGetStudentById() throws IOException {
        SqlSession sqlSession = Mybatis.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        System.out.println("请输入sid");
        Scanner sc = new Scanner(System.in);
        int sid = sc.nextInt();
        Student student = mapper.getStudentById(sid);
        System.out.println(student);
        sqlSession.close();

    }

}
