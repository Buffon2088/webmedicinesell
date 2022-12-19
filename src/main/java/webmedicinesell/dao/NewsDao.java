package webmedicinesell.dao;

import webmedicinesell.pojo.NewsInfo;

import java.util.List;

public interface NewsDao {

    List<NewsInfo> findAll();

    NewsInfo findNews(NewsInfo newsInfo);

    int addNews(NewsInfo newsInfo);

    int updateNews(NewsInfo newsInfo);

    int deleteNews(NewsInfo newsInfo);
}
