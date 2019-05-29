package com.miaosha.controller;

import com.miaosha.bean.User;
import com.miaosha.service.impl.UserServiceImpl;
import com.miaosha.utils.CodeMsg;
import com.miaosha.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class TestController {

    @Autowired
    private UserServiceImpl userService;

    /**
     * 测试模板集成
     * @param name
     * @param model
     * @return
     */
    @RequestMapping("getHello")
    public String getHello(String name, Model model){
       model.addAttribute("name", name);
       return "hello";
    }

    /**
     * 测试返回结果集
     * @return
     */
    @RequestMapping("getUserList")
    @ResponseBody
    public Result getUserList(){
        List<User> userList = userService.getUserList();
        return Result.success(userList);
    }

    /**
     * 测试事务
     * @param name
     * @return
     */
    @RequestMapping("saveUser")
    @ResponseBody
    public Result saveUser(String name){
        Boolean bool = userService.saveUser(name);
        return Result.error(CodeMsg.errorCode);
    }
}
