package webmedicinesell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webmedicinesell.pojo.DrugTypeInfo;
import webmedicinesell.service.IDrugTypeService;

import java.util.List;

@Controller
@RequestMapping("/drugType")
public class DrugTypeController {

    @Autowired
    private IDrugTypeService drugTypeService;

    @RequestMapping("/findAllDrugType")
    public String findAllDrugType(Model model){
        List<DrugTypeInfo> drugTypeInfoList = drugTypeService.findAll();
        model.addAttribute("drugTypeList",drugTypeInfoList);
        return "/drugType/drugType_show";
    }

    @RequestMapping("/showById")
    public String showById(DrugTypeInfo drugTypeInfo,Model model){
        DrugTypeInfo Info = drugTypeService.findDrugType(drugTypeInfo);
        model.addAttribute("drugTypeInfo",Info);
        return "/drugType/drugType_update";
    }

    @RequestMapping("/showAdd")
    public String showAdd(){
        return "/drugType/drugType_add";
    }

    @RequestMapping("/addDrugType")
    public String addDrugType(DrugTypeInfo drugTypeInfo,Model model){
        if (drugTypeService.addDrugType( drugTypeInfo)){
            return "redirect:/drugType/findAllDrugType";
        }else{
            model.addAttribute("error","添加失败");
            return "/error";
        }
    }

    @RequestMapping("/updateDrugType")
    public String updateDrugType(DrugTypeInfo drugTypeInfo,Model model){
        if (drugTypeService.updateDrugType(drugTypeInfo)){
            return "redirect:/drugType/findAllDrugType";
        }else{
            model.addAttribute("error","修改失败");
            return "/error";
        }
    }

    @RequestMapping("/deleteDrugType")
    public String deleteDrugType(DrugTypeInfo drugTypeInfo,Model model){
        if (drugTypeService.deleteDrugType(drugTypeInfo)){
            return "redirect:/drugType/findAllDrugType";
        }else{
            model.addAttribute("error","删除失败");
            return "/error";
        }
    }
}
