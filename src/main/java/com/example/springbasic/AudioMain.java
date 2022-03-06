package com.example.springbasic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AudioMain {
    public static void main(String[] args) {
        // 用最基础的类资源加载方式初始化spring上下文
        ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("META-INF/spring/ApplicationContext.xml");
        CompactDisc disc = context.getBean(CompactDisc.class);
        disc.play();
        context.close();
    }
    
}
