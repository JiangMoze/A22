package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Administrator on 2016/11/26.
 */
@Controller
public class HelloBootController {
    @Value("${welcome.main}")
    private String welcome;

    @RequestMapping("/")
    public String index(Map map){
        map.put("hrb","哈尔滨");
        map.put("welcome",welcome);
        return "index";
    }
}
