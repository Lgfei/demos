package com.lgfei.demo.activemq.springboot;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    @JmsListener(destination = "springboot.activemq.queue")
    public void receiveQueue(String msg) {
        System.out.println("消费者获取的消息:" + msg);
    }
}
