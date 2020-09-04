package com.example.web2.mail;


import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
public class mailUtil {

    @Resource
    private JavaMailSender javaMailSender;

    public void sumdis(mailUser mailUser) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("1225913754@qq.com");
            message.setTo(mailUser.getRecipient());
            message.setSubject(mailUser.getSubject());
            message.setText(mailUser.getContent());
            javaMailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("邮件发送失败" + e.getMessage());
        }
    }
}
