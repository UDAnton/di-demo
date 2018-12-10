package com.github.udanton.didemo.config;

import com.github.udanton.didemo.examples.FakeDataSource;
import com.github.udanton.didemo.examples.FakeFtpApi;
import com.github.udanton.didemo.examples.FakeJmsBroker;
import com.github.udanton.didemo.examples.FakeRestApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Value("${datasource.username}")
    private String datasourceUserName;

    @Value("${datasource.password}")
    private String datasourcePassword;

    @Value("${datasource.url}")
    private String datasourceUrl;

    @Value("${jms.username}")
    private String jmsUserName;

    @Value("${jms.password}")
    private String jmsPassword;

    @Value("${jms.url}")
    private String jmsUrl;

    @Value("${ftp.username}")
    private String ftpUserName;

    @Value("${ftp.password}")
    private String ftpPassword;

    @Value("${ftp.url}")
    private String ftpUrl;

    @Value("${rest.username}")
    private String restUserName;

    @Value("${rest.password}")
    private String restPassword;

    @Value("${rest.url}")
    private String restUrl;

    @Bean
    public FakeFtpApi fakeFtpApi() {
        FakeFtpApi fakeFtpApi = new FakeFtpApi();
        fakeFtpApi.setUserName(this.ftpUserName);
        fakeFtpApi.setPassword(this.ftpPassword);
        fakeFtpApi.setUrl(this.ftpUrl);
        return fakeFtpApi;
    }

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(this.datasourceUserName);
        fakeDataSource.setPassword(this.datasourcePassword);
        fakeDataSource.setUrl(this.datasourceUrl);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUserName(this.jmsUserName);
        fakeJmsBroker.setPassword(this.jmsPassword);
        fakeJmsBroker.setUrl(this.jmsUrl);
        return fakeJmsBroker;
    }

    @Bean
    public FakeRestApi fakeRestApi() {
        FakeRestApi fakeRestApi = new FakeRestApi();
        fakeRestApi.setUserName(this.restUserName);
        fakeRestApi.setPassword(this.restPassword);
        fakeRestApi.setUrl(this.restUrl);
        return fakeRestApi;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
                new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
