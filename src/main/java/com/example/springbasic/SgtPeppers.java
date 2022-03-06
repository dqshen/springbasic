package com.example.springbasic;

import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ComponentScan
public class SgtPeppers implements CompactDisc {
    public void play(){
        log.info("SgtPeppers\' playing!");
    };
}