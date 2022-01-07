package cn.bdqn.service.impl;

import cn.bdqn.service.AsyncSendMessage;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncSendMessageImpl implements AsyncSendMessage {
    @Async
    public void sendMessage() {
        try {
            System.out.println("正在发送短信....");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("发送短信完毕");
    }
}
