package webmedicinesell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webmedicinesell.pojo.CompanyInfo;
import webmedicinesell.service.ICompanyService;

import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @RequestMapping("/findAllCompany")
    public String findAllCompany(Model model){
        List<CompanyInfo> companyInfoList = companyService.findAll();
        model.addAttribute("companyList",companyInfoList);
        return "/company/company_show";
    }

    @RequestMapping("/showById")
    public String showById(CompanyInfo companyInfo,Model model){
        CompanyInfo Info = companyService.findCompany(companyInfo);
        model.addAttribute("companyInfo",Info);
        return "/company/company_update";
    }

    @RequestMapping("/updateCompany")
    public String updateCompany(CompanyInfo companyInfo,Model model){
        if(companyService.updateCompany(companyInfo)){
            return "redirect:/company/findAllCompany";
        }else{
            model.addAttribute("error","修改失败");
            return "/error";
        }
    }

    @RequestMapping("/showAdd")
    public String showAdd(){
        return "/company/company_add";
    }

    @RequestMapping("/addCompany")
    public String addCompany(CompanyInfo companyInfo,Model model){
        if(companyService.addCompany(companyInfo)){
            return "redirect:/company/findAllCompany";
        }else{
            model.addAttribute("error","添加失败");
            return "/error";
        }
    }

    @RequestMapping("/deleteCompany")
    public String deleteCompany(CompanyInfo companyInfo,Model model){
        if(companyService.deleteCompany(companyInfo)){
            return "redirect:/company/findAllCompany";
        }else{
            model.addAttribute("error","删除失败");
            return "/error";
        }
    }
}
