package com.mini.controller;

import com.mini.response.CommontReturnType;
import com.mini.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/job")
@CrossOrigin(origins = "*", allowCredentials = "true")
public class JobController {
    @Autowired
    private JobService jobService;

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test(String nickName, String avatarUrl) {
        System.out.println("nickName=" + nickName + "\navatarUrl = " + avatarUrl);
        Map<String, String> map = new HashMap<>();
        map.put("status", "ok");
        return map;
    }

    @RequestMapping("/getJobs")
    @ResponseBody
    public CommontReturnType getJobs(
            @RequestParam String search,
            @RequestParam Integer currentPage,
            @RequestParam Integer pageSize
    ) {
        if (currentPage == null | pageSize == null) {
            currentPage = 1;
            pageSize = 10;
        }
        if (currentPage < 1) {
            currentPage = 1;
        }
        return CommontReturnType.create(jobService.getJobs(search, currentPage, pageSize));
    }

    @RequestMapping("/getJob")
    @ResponseBody
    public CommontReturnType getJob(
            @RequestParam Integer id
    ) {
        return CommontReturnType.create(jobService.selectJobById(id));
    }

}
