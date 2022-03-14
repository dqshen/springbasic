package com.example.springbasic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AudioMain {
    public static void main(String[] args) {
        // 用最基础的类资源加载方式初始化spring上下文
        /* ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("META-INF/spring/ApplicationContext.xml");
        CompactDisc disc = context.getBean(CompactDisc.class);
        disc.play();
        context.close(); */

        // 用最基础的类资源加载方式初始化spring上下文
        // spring xml用构造器注入和属性注入两种方式创建bean
        ClassPathXmlApplicationContext contextPnamespace =
        new ClassPathXmlApplicationContext("META-INF/spring/ApplicationContext.xml");
        CompactDisc discBlank = (CompactDisc)contextPnamespace.getBean("compactDisc");
        CompactDisc discBlankProp = (CompactDisc)contextPnamespace.getBean("compactDiscProp");
        discBlank.play();
        discBlankProp.play();
        contextPnamespace.close();
    }
    
}
