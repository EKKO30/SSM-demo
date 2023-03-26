package com.itSSM.Controller;

import com.itSSM.pojo.Book;
import com.itSSM.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/books")
public class bookController {

    @Autowired
    private bookservice bookservice;

    @PostMapping
    public result add(@RequestBody Book book) {
        Boolean b=bookservice.add(book);
        return new result(b ? code.ADD_OK:code.ADD_ERR,b);
    }

    @PutMapping
    public result update(@RequestBody Book book) {
        Boolean b=bookservice.update(book);
        return new result(b ? code.UPDATE_OK:code.UPDATE_ERR,b);
    }

    @DeleteMapping("/{id}")
    public result delete(@PathVariable int id) {
        Boolean b=bookservice.delete(id);
        return new result(b ? code.DELETE_OK:code.DELETE_ERR,b);
    }

    @GetMapping
    public result selectAll() {
        Integer a;
        String msg;
        List<Book> books=bookservice.selectAll();
        if(books!=null){
             a=code.SELECT_OK;
             msg="";
        }else {
             a=code.SELECT_ERR;
             msg="查询失败";
        }
        return new result(a,msg,books);
    }

    @GetMapping("/id/{id}")
    public result selectById(@PathVariable int id) {
        Integer a;
        String msg;
        Book book=bookservice.selectById(id);
        if(book!=null){
            a=code.SELECT_OK;
            msg="";
        }else {
            a=code.SELECT_ERR;
            msg="查询失败";
        }
        return new result(a,msg,book);
    }

    @GetMapping("/name/{name}")
    public result selectByName(@PathVariable String name){
        Integer a;
        String msg;
        List<Book> books=bookservice.selectByName(name);
        if(books!=null){
            a=code.SELECT_OK;
            msg="";
        }else {
            a=code.SELECT_ERR;
            msg="查询失败";
        }
        return new result(a,msg,books);
    }
}
