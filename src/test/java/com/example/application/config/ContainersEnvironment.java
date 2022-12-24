package com.example.application.config;

import com.example.application.containers.PostgresTestContainer;
import org.testcontainer.junit.jupiter.Conationer;
import org.testcontainers.junit.jupiter.TestContainers;

public class ContainersEnvironment {
    @Container
    public static PostgreSQLContainer postgreSQLContainer = PostgresTestContainer.getInstance();
}
