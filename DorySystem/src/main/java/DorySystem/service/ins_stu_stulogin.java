package DorySystem.service;

import DorySystem.dao.Mapper;
import DorySystem.model.Account;
import DorySystem.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet("/insstustulogin")
public class ins_stu_stulogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String name = new String(req.getParameter("name").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        String password = "123456";
        int identfy;

        if (req.getParameter("id").startsWith("1")){
            identfy = 1;
        } else if (req.getParameter("id").startsWith("2")){
            identfy = 2;
        } else if (req.getParameter("id").startsWith("3")){
            identfy = 3;
        } else if (req.getParameter("id").startsWith("4")){
            identfy = 4;
        } else {
            identfy = 0;
        }

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);

        Account account = new Account(id,name,password,identfy);
        System.out.println(account);
        try {
            int i = mapper.addAccount(account);
            PrintWriter writer = resp.getWriter();

            if (i == 1){
                req.setAttribute("account",account);
                writer.write("<script>alert('添加成功!密码是123456')</script>");
//                req.getRequestDispatcher("/main.jsp").forward(req,resp);
            } else {
                writer.write("<script>alert('添加失败!')</script>");
//                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }
        }catch (Exception e){
            PrintWriter writer = resp.getWriter();
            writer.write("<script>alert('哦豁出错了!')</script>");
//            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
