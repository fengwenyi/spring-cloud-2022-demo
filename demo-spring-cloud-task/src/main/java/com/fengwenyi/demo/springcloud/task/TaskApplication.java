package com.fengwenyi.demo.springcloud.task;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

/**
 * @author <a href="https://fengwenyi.com">Erwin Feng</a>
 * @since 2023-05-10
 */
@SpringBootApplication
@EnableTask
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new HelloWorldCommandLineRunner();
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return new HelloWorldApplicationRunner();
    }

    public static class HelloWorldCommandLineRunner implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {
            System.out.println("Hello World!");
        }
    }

    public static class HelloWorldApplicationRunner implements ApplicationRunner {

        @Override
        public void run(ApplicationArguments args) throws Exception {
            System.out.println("Hello World! from ApplicationRunner");
        }
    }

}
