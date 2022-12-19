package webmedicinesell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webmedicinesell.pojo.NewsInfo;

import webmedicinesell.service.INewsService;


import java.util.List;

@Controller
@RequestMapping("/news")
public class NewController {

    @Autowired
    private INewsService newsService;

    @RequestMapping("/findAllNews")
    public String findAllNews(Model model){
        List<NewsInfo> newsInfoList = newsService.findAll();
        model.addAttribute("newsInfoList",newsInfoList);
        return "/news/news_show";
    }

    @RequestMapping("/showAdd")
    public String showAdd(){
        return "/news/news_add";
    }

    @RequestMapping("/addNews")
    public String addNews(NewsInfo newsInfo,Model model){
        if (newsService.addNews(newsInfo)){
            return "redirect:/news/findAllNews";
        }else{
            model.addAttribute("error","添加失败");
            return "/error";
        }
    }

    @RequestMapping("/findNewsById")
    public String findNewsById(NewsInfo newsInfo,Model model){
        NewsInfo Info = newsService.findNews(newsInfo);
        model.addAttribute("newsInfo",Info);
        return "/news/news_update";
    }

    @RequestMapping("/updateNews")
    public String updateNews(NewsInfo newsInfo,Model model){
        if(newsService.updateNews(newsInfo)){
            return "redirect:/news/findAllNews";
        }else{
            model.addAttribute("error","修改失败");
            return "/error";
        }
    }

    @RequestMapping("/deleteNews")
    public String deleteNews(NewsInfo newsInfo,Model model){
        if (newsService.deleteNews(newsInfo)){
            return "redirect:/news/findAllNews";
        }else{
            model.addAttribute("error","删除失败");
            return "/error";
        }
    }
}
