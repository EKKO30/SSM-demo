package com.itSSM.Dao;

import com.itSSM.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface bookDao {
    //添加
    @Insert("insert into tb_books values (null,#{type},#{name},#{description})")
    Boolean  add(Book book);

    //修改
    @Update("update tb_books set type =#{type},name=#{name},description=#{description} where id=#{id}")
    Boolean update(Book book);

    //删除
    @Delete("delete from tb_books where id=#{id}")
    Boolean delete(int id);

    //查询所有
    @Select("select * from tb_books")
    List<Book> selectAll();

    @Select("select * from tb_books where id=#{id}")
    Book selectById(int id);

    @Select("select * from tb_books where name like CONCAT('%', #{name}, '%') ")
    List<Book> selectByName(String name);
}
