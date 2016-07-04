package br.com.ahw.mkiller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="br.com.ahw.mkiller")
public class SpringBootWebApplication {

    public static void main(String[] args) {
    	SpringApplication.run(SpringBootWebApplication.class, args);
    }
}