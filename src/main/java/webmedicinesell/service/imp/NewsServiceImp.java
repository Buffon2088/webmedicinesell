package webmedicinesell.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webmedicinesell.dao.NewsDao;
import webmedicinesell.pojo.NewsInfo;
import webmedicinesell.service.INewsService;

import java.util.List;

@Service
@Transactional
public class NewsServiceImp implements INewsService {

    @Autowired
    private NewsDao newsDao;


    @Override
    public List<NewsInfo> findAll() {
        return newsDao.findAll();
    }

    @Override
    public NewsInfo findNews(NewsInfo newsInfo) {
        return newsDao.findNews(newsInfo);
    }

    @Override
    public boolean addNews(NewsInfo newsInfo) {
        return newsDao.addNews(newsInfo)>0;
    }

    @Override
    public boolean updateNews(NewsInfo newsInfo) {
        return newsDao.updateNews(newsInfo)>0;
    }

    @Override
    public boolean deleteNews(NewsInfo newsInfo) {
        return newsDao.deleteNews(newsInfo)>0;
    }
}
