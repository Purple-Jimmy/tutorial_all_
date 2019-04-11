package com.mongo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Document指定数据插入到MongoDB数据库里的名字为book的集合中
 * @author jimmy
 * @date 2019-04-11 11:39
 */
@Data
@Document(collection = "book")
public class Book implements Serializable {
    private static final long serialVersionUID = -4497394987618721164L;

    /**
     * org.springframework.data.annotation.Id mongodb主键
     */
    @Id
    private Integer id;

    private String name;

    private List<Author> authorList;
}
