package com.github.udanton.didemo;

import com.github.udanton.didemo.examples.FakeDataSource;
import com.github.udanton.didemo.examples.FakeFtpApi;
import com.github.udanton.didemo.examples.FakeJmsBroker;
import com.github.udanton.didemo.examples.FakeRestApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

        FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.toString());

        FakeJmsBroker fakeJmsBroker = applicationContext.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.toString());

        FakeFtpApi fakeFtpApi = (FakeFtpApi) applicationContext.getBean("fakeFtpApi");
        System.out.println(fakeFtpApi.toString());

        FakeRestApi fakeRestApi = applicationContext.getBean(FakeRestApi.class);
        System.out.println(fakeRestApi.toString());

    }
}
