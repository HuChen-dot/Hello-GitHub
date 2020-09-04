package com.example.web2.controller;


import com.example.base.Dao.pojo.Guke;
import com.example.base.Dao.service.guke.GukeService;
import com.example.web2.mail.mailUser;
import com.example.web2.mail.mailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class OrderController {
    @Autowired
    GukeService GukeService;

    @Resource
    mailUtil mailUtil;

    @RequestMapping("sho")
    @ResponseBody
    public String ain() {
        try {
            Guke gukeById = GukeService.getGukeById(5L);
            System.out.println(gukeById);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String s = "nnnnn";
        return s;
    }

    @RequestMapping("chu")
    public String chu() {
        mailUser mailUser = new mailUser();
        mailUser.setContent("邮件内容");
        mailUser.setRecipient("1225913754@qq.com");//邮件接收人
        mailUser.setSubject("邮件主题");
        mailUtil.sumdis(mailUser);
        return "true";
    }

}
