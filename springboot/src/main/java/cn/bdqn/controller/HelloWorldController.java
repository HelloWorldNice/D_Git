package cn.bdqn.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api(tags = "入门模块")
@Controller // ==> @Controller + @ResponseBody
public class HelloWorldController {

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.username}")
    private String jdbcUserName;

    @Value("${jdbc.password}")
    private String jdbcPassword;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(jdbcUrl + "--" + jdbcUserName + "--" + jdbcPassword);
        return "HelloWorld-----";
    }

    @RequestMapping("/user")
    public String user(Map<String,Object> maps){
        maps.put("username","HelloWorld,jsp!!!");
        return "user";
    }
}
