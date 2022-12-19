package webmedicinesell.service;

import webmedicinesell.pojo.NewsInfo;

import java.util.List;

public interface INewsService {
    List<NewsInfo> findAll();

    NewsInfo findNews(NewsInfo newsInfo);

    boolean addNews(NewsInfo newsInfo);

    boolean updateNews(NewsInfo newsInfo);

    boolean deleteNews(NewsInfo newsInfo);
}
