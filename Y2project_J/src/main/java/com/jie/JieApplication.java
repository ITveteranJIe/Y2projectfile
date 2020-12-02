package com.jie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class JieApplication {
    public static void main(String[] args) {
        SpringApplication.run(JieApplication.class, args);
    }

}
