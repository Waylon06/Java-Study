package com.waylon.dms.mapper;

import com.waylon.dms.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    //1.映射文件的namespace要和mapper接口的全类名保持一致
    //2.映射文件中SQL语句的id要和mapper接口中的方法名一致

    /**
     * 增加用户
     * @return
     */
    int insertStudent();

    /**
     * 修改用户信息
     */
    void updateStudent(int sid);

    /**
     * 删除用户信息
     */
    void deleteStudent();

    /**
     * 根据id查询用户
     *
     */
//    注解开发
    @Select("select * from student where sid = #{sid}")
    Student getStudentById(@Param("sid") int sid);

    //    查询一条数据就是实体类对象
//    查询多条数据对应的就是list集合
    @Select("select * from student")
    List<Student> getAllStudent();
}
