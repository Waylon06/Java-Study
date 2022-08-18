package com.waylon.dms.pojo;


import com.alibaba.fastjson.JSON;
import com.waylon.dms.Student;
import com.waylon.dms.dao.Mybatis;
import com.waylon.dms.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/hello")
public class StudentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=utf-8");

////        1.获取所有参数的Map集合
//        Map<String, String[]> map = req.getParameterMap();
//        for (String key : map.keySet()) {
////            获取键
//            System.out.print(key+":");
//            String[] values = map.get(key);
////            获取值
//            for (String value : values) {
//                System.out.println(value);
//            }
//        }

//        System.out.println("........................");
////        2.获取对应的参数值
//        String[] hobbies = req.getParameterValues("hobby");
//        for (String hobby : hobbies) {
//            System.out.println(hobby);
//        }
//        3.根据key获取单个的参数值
//        int username = Integer.parseInt(req.getParameter("username"));
//        String password = req.getParameter("password");
//
//        System.out.println(username);
//        System.out.println(password);


        SqlSession sqlSession = Mybatis.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        System.out.println("请输入sid");
//        Scanner sc = new Scanner(System.in);
//        int sid = sc.nextInt();
//        int sid = username;
//        Student student = mapper.getStudentById(sid);
        List<Student> allStudent = mapper.getAllStudent();
//        req.getSession().setAttribute("woshishuaige", allStudent);
//        System.out.println(allStudent);
        String json = JSON.toJSONString(allStudent);
        System.out.println(json);
//        PrintWriter writer = resp.getWriter();
//        writer.print(json);
        resp.getWriter().write(json);
//        req.getRequestDispatcher("home.jsp").forward(req,resp);
        sqlSession.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
