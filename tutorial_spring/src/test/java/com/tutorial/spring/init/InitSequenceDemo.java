package com.tutorial.spring.init;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author jimmy
 * @date 2019-04-12 17:59
 */
@SpringJUnitConfig
@ContextConfiguration("classpath:applicationContext-aop-anno.xml")
public class InitSequenceDemo {
    @Autowired
    InitSequenceBean initSequenceBean;

    @Test
    public void initTest(){
        System.out.println(initSequenceBean);
    }
}
