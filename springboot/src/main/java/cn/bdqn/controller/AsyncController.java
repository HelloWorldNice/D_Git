package cn.bdqn.controller;

import cn.bdqn.service.AsyncSendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    private AsyncSendMessage asyncSendMessage;

    @RequestMapping("/sendMessage")
    public String sendMessage() throws InterruptedException {

        System.out.println("正在注册中....");
        Thread.sleep(10000);

        asyncSendMessage.sendMessage();
        return "注册成功";
    }

}
