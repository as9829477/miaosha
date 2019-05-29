package com.miaosha.service;

import com.miaosha.bean.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    boolean saveUser(String name);
}
