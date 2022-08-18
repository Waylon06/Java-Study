package DorySystem.service;

import DorySystem.dao.Mapper;
import DorySystem.model.Dorimitory;
import DorySystem.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/insstuupdate")
public class ins_stu_update extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);

        String dname = req.getParameter("dname");
        int dnum = Integer.parseInt(req.getParameter("dnum"));
        String sname = req.getParameter("sname");
        String sstate = req.getParameter("sstate");

        int i = mapper.updStu(sstate,dname,dnum,sname);


        sqlSession.commit();

        if (i == 1){
            PrintWriter writer = resp.getWriter();
            writer.write("<script>alert('修改成功!');window.location.href='../view/student-info.html'</script>");
        }

        sqlSession.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
