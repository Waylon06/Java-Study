package DorySystem.service;

import DorySystem.dao.Mapper;
import DorySystem.model.Account;
import DorySystem.utils.MybatisUtils;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;
import sun.java2d.pipe.AAShapePipe;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/accountverify")
public class accountverify extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        int id = Integer.parseInt(req.getParameter("id"));
        String password = req.getParameter("password");

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper Mapper = sqlSession.getMapper(Mapper.class);

        Account account = Mapper.selAccount(id, password);

        if (account != null){

            int identfy = account.getIdentfy();

            if (identfy == 1){
                req.getSession().setAttribute("account",account);
                req.getRequestDispatcher("/stumain.jsp").forward(req,resp);
                resp.getWriter().write("<script>alert('学生助理您好，欢迎登录!')</script>");
            } else if (identfy == 2){
                req.getSession().setAttribute("account",account);
//                req.getSession().setAttribute("sinstructor",account.getName());
                req.getRequestDispatcher("/insmain.jsp").forward(req,resp);
                resp.getWriter().write("<script>alert('辅导员您好，欢迎登录!')</script>");
            } else if (identfy == 3){
                req.getSession().setAttribute("account",account);
                req.getRequestDispatcher("/dorymain.jsp").forward(req,resp);
                resp.getWriter().write("<script>alert('宿舍管理员您好，欢迎登录!')</script>");
            } else if (identfy == 4){
                req.getSession().setAttribute("account",account);
                req.getRequestDispatcher("/stumain.jsp").forward(req,resp);
                resp.getWriter().write("<script>alert('学生助理您好，欢迎登录!')</script>");
            } else {
                req.getSession().setAttribute("account",account);
                req.getRequestDispatcher("/main.jsp").forward(req,resp);
                resp.getWriter().write("<script>alert('超级管理员您好，欢迎登录!')</script>");
            }
        }else {
            resp.getWriter().write("<script>alert('哦豁出错了!');window.location.href='login.jsp'</script>");
        }

        sqlSession.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
