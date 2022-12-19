package webmedicinesell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webmedicinesell.pojo.UserInfo;
import webmedicinesell.service.IUserService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/userLogin")
    public String userLogin(UserInfo userInfo, HttpSession session, Model model){
        if (userService.userLogin(userInfo)){
            UserInfo Info = userService.findUser(userInfo);
            session.setAttribute("UserInfo",Info);
            return "/user/user_home";
        }else{
            model.addAttribute("error","登录失败");
            return "/error";
        }
    }

    @RequestMapping("/findAllUser")
    public String findAllUser(Model model){
        List<UserInfo> userInfoList = userService.findAll();
        model.addAttribute("userList",userInfoList);
        return "/user/user_show";
    }

    @RequestMapping("/showAdd")
    public String showAdd(){
        return "/user/user_add";
    }

    @RequestMapping("/addUser")
    public String addUser(UserInfo userInfo,Model model){
        if(userService.addUser(userInfo)){
            return "redirect:/user/findAllUser";
        }else{
            model.addAttribute("error","注册失败");
            return "/error";
        }
    }

    @RequestMapping("/showById")
    public String showById(UserInfo userInfo,Model model){
        UserInfo Info = userService.findUser(userInfo);
        model.addAttribute("userInfo",Info);
        return "/user/user_update";
    }

    @RequestMapping("/updateUser")
    public String updateUser(UserInfo userInfo,Model model){
        if (userService.updateUser(userInfo)){
            return "redirect:/user/findAllUser";
        }else{
            model.addAttribute("error","修改失败");
            return "/error";
        }
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(UserInfo userInfo,Model model){
        if (userService.deleteUser(userInfo)){
            return "redirect:/user/findAllUser";
        }else{
            model.addAttribute("error","删除失败");
            return "/error";
        }
    }
}
