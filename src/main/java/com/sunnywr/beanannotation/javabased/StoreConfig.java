package com.sunnywr.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
//@ImportResource("classpath:config.xml")
public class StoreConfig {

    @Autowired
    @Qualifier("stringStore")
    private Store<String> s1;

    @Autowired
    @Qualifier("integerStore")
    private Store<Integer> s2;

    @Bean
    public StringStore stringStore() {
        return new StringStore();
    }

    @Bean
    public IntegerStore integerStore() {
        return new IntegerStore();
    }

    @Bean
    public Store stringStoreTest() {
        System.out.println("s1: " + s1.getClass().getName());
        System.out.println("s2: " + s2.getClass().getName());
        return new StringStore();
    }
//    @Value("${url}")
//    private String url;
//
//    @Value("${jdbc.userName}")
//    private String userName;
//
//    @Value("${password}")
//    private String password;
//
//    @Bean
//    public MyDriverManager myDriverManager() {
//        return new MyDriverManager(url, userName, password);
//    }
}
