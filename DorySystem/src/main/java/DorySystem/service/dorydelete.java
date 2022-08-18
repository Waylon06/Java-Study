package DorySystem.service;

import DorySystem.dao.Mapper;
import DorySystem.model.Dorimitory;
import DorySystem.utils.MybatisUtils;
import com.alibaba.fastjson.JSON;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/dorydelete")
public class dorydelete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);

        String dname = req.getParameter("dname");
        int dnum= Integer.parseInt(req.getParameter("dnum"));

        int i = mapper.delDory(dname,dnum);

        sqlSession.commit();

        if (i == 1){
            PrintWriter writer = resp.getWriter();
            writer.write("<script>alert('删除成功!');window.location.href='../view/student-info.html'</script>");
        }
        sqlSession.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
