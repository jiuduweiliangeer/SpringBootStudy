package com.example.internet.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String dname;
    private Integer dage;
    @Override
    public String toString() {
        return "Dog{" +
                "dname='" + dname + '\'' +
                ", dage=" + dage +
                '}';
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getDage() {
        return dage;
    }

    public void setDage(Integer dage) {
        this.dage = dage;
    }
}
