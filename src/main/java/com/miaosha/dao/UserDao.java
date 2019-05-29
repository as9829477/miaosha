package com.miaosha.dao;

import com.miaosha.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {
    @Select("select * from user")
    List<User> getUserList();

    @Insert("insert into  user values(#{id},#{name})")
    boolean insert(User user);
}
