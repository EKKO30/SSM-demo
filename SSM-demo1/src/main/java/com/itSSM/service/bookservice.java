package com.itSSM.service;

import com.itSSM.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface bookservice {

    /**
     * 添加
     * @param book
     * @return Boolean
     */
    Boolean  add(Book book);

    /**
     * 修改
     * @param book
     * @return Boolean
     */
    Boolean update(Book book);

    /**
     * 删除
     * @param id
     * @return Boolean
     */
    Boolean delete(int id);

    /**
     * 查询
     * @return List<Book>
     */
    List<Book> selectAll();

    /**
     * 删除
     * @param id
     * @return Book
     */
    Book selectById(int id);

    List<Book> selectByName(String name);
}
