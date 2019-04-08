package com.tutorial.databind;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author jimmy
 * @date 2019-04-0822:20
 */
@Data
@Component
@ConfigurationProperties(prefix = "spring.city")
@PropertySource(value= {"classpath:/data-binder.properties"},ignoreResourceNotFound=true,encoding="UTF-8")
public class CityDataBind {
    private Integer id;
    private String name;
}
