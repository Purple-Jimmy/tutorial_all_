package com.mongo.repository;

import com.mongo.entity.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author jimmy
 * @date 2019-04-11 14:12
 */
public interface AuthorRepository extends MongoRepository<Author, Integer> {

    /**
     * Like（模糊查询）
     * {"name" : name} ( name as regex)
     */
    List<Author> findByNameLike(String name);
}
