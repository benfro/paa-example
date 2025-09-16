package com.redpill.demo.audithub;

import org.springframework.boot.SpringApplication;

public class TestAuditHubApplication {

    public static void main(String[] args) {
        SpringApplication.from(AuditHubApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
