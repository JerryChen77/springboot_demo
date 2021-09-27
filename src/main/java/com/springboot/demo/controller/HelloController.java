package com.springboot.demo.controller;

import com.springboot.demo.dao.AccountDao;
import com.springboot.demo.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cjl
 * @date 2021/7/20 14:52
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private Integer age;

    @Value("${countries[0]}")
    private String countries;

    @Autowired
    private Account account;

    @Autowired
    private AccountDao accountDao;
        @GetMapping("hi")
        public String hi(){
            Account account = accountDao.selectByPrimaryKey(1);
            System.out.println("account = " + account);
//            System.out.println("countries = " + countries);
//            System.out.println("account = " + this.account);
//            System.out.println("springboot 访问成功! name="+name+",age="+age);
            return "springboot 访问成功! name="+name+",age="+age;
        }
}
