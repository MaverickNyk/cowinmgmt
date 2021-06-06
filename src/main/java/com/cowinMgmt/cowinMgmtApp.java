package com.cowinMgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication(scanBasePackages = "com.cowinMgmt.*")
@EnableElasticsearchRepositories
public class cowinMgmtApp {
    public static void main(String[] args) {
        SpringApplication.run(cowinMgmtApp.class, args);
    }
}