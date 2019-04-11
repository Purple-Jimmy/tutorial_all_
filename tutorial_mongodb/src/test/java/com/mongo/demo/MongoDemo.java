package com.mongo.demo;

import com.mongo.MongoStart;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author jimmy
 * @date 2019-04-11 11:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongoStart.class)
@Slf4j
public class MongoDemo {

    @Test
    public void test(){

    }
}
