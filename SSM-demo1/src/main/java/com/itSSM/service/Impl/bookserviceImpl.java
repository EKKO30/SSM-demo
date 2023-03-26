package com.itSSM.service.Impl;

import com.itSSM.Dao.bookDao;
import com.itSSM.pojo.Book;
import com.itSSM.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookserviceImpl implements bookservice {

    @Autowired
    private bookDao bookDao;

    @Override
    public Boolean add(Book book) {
        bookDao.add(book);
        return true;
    }

    @Override
    public Boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public Boolean delete(int id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public List<Book> selectAll() {
        return bookDao.selectAll();
    }

    @Override
    public Book selectById(int id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> selectByName(String name) {
        return bookDao.selectByName(name);
    }
}
