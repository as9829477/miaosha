package com.miaosha;

import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan(basePackages = "com.miaosha.dao")
public class App 
{
    public static void main( String[] args )
    {

        SpringApplication.run(App.class, args);
    }
}
