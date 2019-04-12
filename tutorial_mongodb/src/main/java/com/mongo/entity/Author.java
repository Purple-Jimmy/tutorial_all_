package com.mongo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author jimmy
 * @date 2019-04-11 11:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "author")
public class Author {
    private Integer id;
    private String name;

}
