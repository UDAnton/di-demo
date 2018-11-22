package com.github.udanton.didemo;

import com.github.udanton.didemo.controllers.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);
        TestController testController = (TestController) applicationContext.getBean("testController");
        testController.hello();
    }
}
