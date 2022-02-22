package com.codekul.Java28SeptSpring.aop;

import org.springframework.stereotype.Component;

@Component
public class Boy {
    public int study(int i){
        System.out.println("Boy Study");
        return 100;
    }
}
