package com.github.udanton.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    private Integer number = 1;

    public LifeCycleDemoBean() {
        System.out.println(String.valueOf(number) + " LifeCycleDemoBean constructor");
        number++;
    }

    // InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(String.valueOf(number) + " LifeCycleDemoBean properties set");
        number++;
    }

    // DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println(String.valueOf(number) + " LifeCycleDemoBean terminated");
        number++;
    }

    // BeanNameAware
    @Override
    public void setBeanName(String s) {
        System.out.println(String.valueOf(number) + " Bean name " + s);
        number++;
    }

    // BeanFactoryAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(String.valueOf(number) + " Bean factory set");
        number++;
    }

    //ApplicationContextAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(String.valueOf(number) + " Application Context set");
        number++;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(String.valueOf(number) + " Post construct method called");
        number++;
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(String.valueOf(number) + " Pre Destroy method called");
        number++;
    }

    public void beforeInit() {
        System.out.println(String.valueOf(number) + " Before Init method called by Bean Post Processor");
        number++;
    }

    public void afterInit() {
        System.out.println(String.valueOf(number) + " After Init method called by Bean Post Processor");
        number++;
    }
}
