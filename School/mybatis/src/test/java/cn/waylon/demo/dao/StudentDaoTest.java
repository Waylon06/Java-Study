package cn.waylon.demo.dao;

import cn.waylon.demo.pojo.Student;
import cn.waylon.demo.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class StudentDaoTest {
    SqlSession sqlSession;
    @Test
    public void test() {
        try {
            sqlSession = MybatisUtils.getSqlSession();
            StudentDao mapper = sqlSession.getMapper(StudentDao.class);
            List<Student> studentList = mapper.getStudentList();
            for(Student student : studentList) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
//            sqlSession.close();
        }
    }
}
