package cn.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 1、该类既是一个项目启动类，也是一个配置类，我们可以在这个类中注册Bean

@SpringBootApplication // 表示的一个Spring应用
@ImportResource(value = {"classpath:user-beans.xml"})
@MapperScan(basePackages = {"cn.bdqn.mapper"})
@EnableAsync // 开启异步任务
@EnableScheduling // 开启定时任务
public class HelloWorldSpringBootApplication {
    public static void main(String[] args) {
        // 启动Spring应用
        // 1、启动Spring容器
        // 2、启动Tomcat服务器
        SpringApplication.run(HelloWorldSpringBootApplication.class,args);
    }
}
