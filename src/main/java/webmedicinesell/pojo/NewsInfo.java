package webmedicinesell.pojo;

public class NewsInfo {

    private int newsId;
    private String newsContext;
    private String newsIntroduce;
    private String newsTime;

    public NewsInfo() {
    }

    public NewsInfo(int newsId, String newsContext, String newsIntroduce, String newsTime) {
        this.newsId = newsId;
        this.newsContext = newsContext;
        this.newsIntroduce = newsIntroduce;
        this.newsTime = newsTime;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getNewsContext() {
        return newsContext;
    }

    public void setNewsContext(String newsContext) {
        this.newsContext = newsContext;
    }

    public String getNewsIntroduce() {
        return newsIntroduce;
    }

    public void setNewsIntroduce(String newsIntroduce) {
        this.newsIntroduce = newsIntroduce;
    }

    public String getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(String newsTime) {
        this.newsTime = newsTime;
    }
}
