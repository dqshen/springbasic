package com.example.springbasic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * @SpringBootTest是spring-boot提供的组合注解，
 * 包括重要的@ExtendWith(value=SpringExtension.class),
 * 它是确定测试类里的断言、测试等等注解将如何执行的测试类常用注解
 * 
 * @ContextConfiguration引入名为CDPlayerConfig的bean配置类
 */
@SpringBootTest
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDplayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() throws Exception {
        /* 引入system-lamda包截取系统输出，进行断言测试 */
        String text = tapSystemOut(() -> {
            player.play();
        });

        assertTrue(text.endsWith(
                "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n"));
    };
}
