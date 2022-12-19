package webmedicinesell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import webmedicinesell.pojo.AdminInfo;
import webmedicinesell.service.IAdminService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    @RequestMapping("/showLogin")
    public String showLogin(){
        return "/admin/admin_login";
    }

    @RequestMapping("/adminLogin")
    public String adminLogin(AdminInfo adminInfo, Model model, HttpSession session){
        if(adminService.adminLogin(adminInfo)){
            AdminInfo Info = adminService.findAdmin(adminInfo);
            session.setAttribute("adminInfo",Info);
            return "/admin/adminHome";
        }else{
            model.addAttribute("error","登录失败");
            return "/error";
        }
    }

    @RequestMapping("/findAllAdmin")
    public String findAllAdmin(Model model){
        List<AdminInfo> adminInfoList = adminService.findAll();
        model.addAttribute("adminList",adminInfoList);
        return "/admin/admin_show";
    }

    @RequestMapping("/showAdd")
    public String showAdd(Model model){
        //获取AdminLevel字段的数据,并且确保数据库中至少有两种AdminLevel角色
        List<AdminInfo> adminTypeList =adminService.findAllAdminType();
        model.addAttribute("adminTypeList",adminTypeList);

        return "/admin/admin_add";
    }

    @RequestMapping("/addAdmin")
    public String addAdmin(AdminInfo adminInfo,Model model){
        if (adminService.addAdmin(adminInfo)){
            return "redirect:/admin/findAllAdmin";
        }else{
            model.addAttribute("error","注册失败");
            return "/error";
        }
    }

    @RequestMapping("/showById")
    public String showById(AdminInfo adminInfo,Model model){
        AdminInfo Info = adminService.findAdmin(adminInfo);
        model.addAttribute("adminInfo",Info);
        //获取AdminLevel字段的数据,并且确保数据库中至少有两种AdminLevel角色
        List<AdminInfo> adminTypeList =adminService.findAllAdminType();
        model.addAttribute("adminTypeList",adminTypeList);
        return "/admin/admin_update";
    }

    @RequestMapping("/updateAdmin")
    public String updateAdmin(AdminInfo adminInfo,Model model){
        if (adminService.updateAdmin(adminInfo)){
            return "redirect:/admin/findAllAdmin";
        }else{
            model.addAttribute("error","修改失败");
            return "/error";
        }
    }

    @RequestMapping("/deleteAdmin")
    public String deleteAdmin(AdminInfo adminInfo,Model model){
        if (adminService.deleteAdmin(adminInfo)){
            return "redirect:/admin/findAllAdmin";
        }else{
            model.addAttribute("error","修改失败");
            return "/error";
        }
    }
}
