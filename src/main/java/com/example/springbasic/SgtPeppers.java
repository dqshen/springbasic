package com.example.springbasic;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SgtPeppers implements CompactDisc {
    public void play(){
        log.info("SgtPeppers\' playing!");
    }
}