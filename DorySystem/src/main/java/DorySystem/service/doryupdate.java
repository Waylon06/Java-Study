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

@WebServlet("/doryupdate")
public class doryupdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);

        String dname = req.getParameter("dname");
        int dfloor = Integer.parseInt(req.getParameter("dfloor"));
        int dnum= Integer.parseInt(req.getParameter("dnum"));
        String dstate = req.getParameter("dstate");
        String sname = req.getParameter("sname");
        String sinstructor = req.getParameter("sinstructor");
        String sstate = req.getParameter("sstate");
        int id = dnum+1000;

        Dorimitory dorimitory = new Dorimitory(dname,dfloor,dnum,dstate,sname,sinstructor,sstate,id);
        int i = mapper.addDory(dorimitory);

        sqlSession.commit();

        if (i == 1){
            PrintWriter writer = resp.getWriter();
            writer.write("<script>alert('设置成功!');window.location.href='../view/student-info.html'</script>");
        }

        sqlSession.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
