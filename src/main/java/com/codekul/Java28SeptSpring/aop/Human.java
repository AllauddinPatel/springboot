package com.codekul.Java28SeptSpring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {

//    @Before("pointCut()")
//    public  void wakeup(JoinPoint joinPoint){
//        System.out.println("Wake up"+joinPoint.getSignature());
//    }
//
//    @After("pointCut()")
//    public  void slepp(){
//        System.out.println("Sleep");
//    }

    @Pointcut("execution(public * study(..))")
    public void pointCut(){

    }

    @AfterReturning(pointcut = "pointCut()" , returning = "value")
    public void afterret(int value){
        System.out.println("After returning "+value);
    }

    @AfterThrowing(pointcut = "pointCut()" ,throwing = "value")
    public void afterthr(MyException value){
        System.out.println("After Throwing "+value);
    }
}
