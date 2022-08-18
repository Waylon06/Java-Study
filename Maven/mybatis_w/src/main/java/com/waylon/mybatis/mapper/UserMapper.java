package com.waylon.mybatis.mapper;

import com.waylon.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    //1.映射文件的namespace要和mapper接口的全类名保持一致
    //2.映射文件中SQL语句的id要和mapper接口中的方法名一致

    /**
     * 增加用户
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户信息
     */
    void deleteUser();

    /**
     * 根据id查询用户
     */
    User getUserById();

//    查询一条数据就是实体类对象
//    查询多条数据对应的就是list集合
    List<User> getAllUser();
}
