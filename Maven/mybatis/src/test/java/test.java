import com.app.mapper.MybatisMapper;
import com.app.pojo.User;
import com.app.utile.dao.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void  test1()
    {
        SqlSession sqlSession= MybatisUtils.getsqlSession();
        MybatisMapper mapper = sqlSession.getMapper(MybatisMapper.class);
        List<User> findall = mapper.findall();
        System.out.println(findall);
    }
}
