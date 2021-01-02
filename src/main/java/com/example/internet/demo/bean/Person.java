package com.example.internet.demo.bean;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
/*
 * 只有这个组件是容器的组件，才能使用容器提供的@ConfigurationProperties功能；
 * @ConfigurationProperties默认从全局配置文件中获取值；
 * 如果想要读取指定配置文件，则使用@PropertySouce来读取；
 *
 *
 * */
@Component
/*@PropertySource(value = {"classpath:person.properties"})*/
@ConfigurationProperties(prefix = "person")//将配置文件加载到这个bean中，这个bean必须是组件，所以需要加入Component注解
/*@ConfigurationProperties(prefix = "person")*/
public class Person {
    /*
       * <bean class='person'>
           <property name="lastName" value="字面量/${key}从环境变量，配置文件中获取值/#{SpEL}"></property>
       * </bean>
       *
       *
       * */
    //@Value("${person.lastName}")//从配置文件中取值
    private String name;
    //@Value("#{11*22}")//直接计算式计算
    private Integer age;
    //@Value("true")//直接给字面量
    private boolean boss;
    private Map<String,Object> map;
    private List<Object> list;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
