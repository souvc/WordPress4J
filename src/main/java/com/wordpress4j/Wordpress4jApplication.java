package com.wordpress4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 入口类
 * @author souvc
 */
@SpringBootApplication
@EnableAsync
public class Wordpress4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(Wordpress4jApplication.class, args);
    }

}
