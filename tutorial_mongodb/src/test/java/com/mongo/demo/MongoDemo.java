package com.mongo.demo;

import com.mongo.MongoStart;
import com.mongo.entity.Author;
import com.mongo.repository.AuthorRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author jimmy
 * @date 2019-04-11 11:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MongoStart.class)
@Slf4j
public class MongoDemo {
    @Resource
    AuthorRepository authorRepository;

    @Test
    public void saveAuthor(){
        authorRepository.save(new Author(1,"jimmy1"));
        authorRepository.save(new Author(2,"jimmy2"));
        authorRepository.save(new Author(3,"jimmy3"));
        authorRepository.save(new Author(4,"jimmy4"));
        authorRepository.save(new Author(5,"jimmy5"));
        authorRepository.save(new Author(5,"jimmy5++"));
        System.out.println(authorRepository.findAll().size());
    }
}
