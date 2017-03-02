package com.example.controller;

import com.example.vo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xyw on 2017/3/2.
 */
@RestController
public class DataController {

    @RequestMapping("/personinfo")
    public Person index(){
        return new Person("andy","yubei",10);
    }
}
