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

@WebServlet("/doryinsert")
public class doryinsert extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        Mapper mapper = sqlSession.getMapper(Mapper.class);

        String dname = req.getParameter("dname");
        int dfloor = Integer.parseInt(req.getParameter("dfloor"));
        int dnum= Integer.parseInt(req.getParameter("dnum"));
        String dstate = "可使用";
        String sname = req.getParameter("sname");
        String sinstructor = req.getParameter("sinstructor");
        String sstate = "正常";
        int id = dnum+1000;

//        for (int i = 311;i < 320;i ++){
//            String dname = "博慧一";
//            int dfloor = 3;
//            int dnum= i;
//            String dstate = "可使用";
//            String sname = "王五";
//            String sinstructor = "周婷";
//            String sstate = "缺勤";
//            int id = dnum+1000;
//
//        }

        Dorimitory dorimitory = new Dorimitory(dname,dfloor,dnum,dstate,sname,sinstructor,sstate,id);
        int j = mapper.addDory(dorimitory);

        sqlSession.commit();

        if (j == 1){
            PrintWriter writer = resp.getWriter();
            writer.write("<script>alert('添加成功!');window.location.href='../view/student-info.html'</script>");
        }

        sqlSession.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
