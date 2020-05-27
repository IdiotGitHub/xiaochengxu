package com.mini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*", allowCredentials = "true")
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test(String nickName, String avatarUrl) {
        System.out.println("nickName=" + nickName + "\navatarUrl = " + avatarUrl);
        Map<String, String> map = new HashMap<>();
        map.put("status", "ok");
        return map;
    }
}
