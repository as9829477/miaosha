package com.miaosha.service.impl;

import com.miaosha.bean.User;
import com.miaosha.dao.UserDao;
import com.miaosha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     *测试集成mysql是否成功
     * @return
     */
    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    /**
     * 测试事务
     * @param name
     * @return
     */
    @Override
    @Transactional
    public boolean saveUser(String name) {
        User user = new User();
        user.setId(2);
        user.setName(name);
        userDao.insert(user);

        user.setId(2);
        user.setName(name);
        userDao.insert(user);
        return true;
    }
}
