package com.ojt.studentcrud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<String> courses() {

        List<String> list = new ArrayList<>();

        list.add("Java");

        list.add("Spring Boot");

        list.add("React");

        return list;

    }

}