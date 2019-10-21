package com.zql.controller;

import com.alibaba.fastjson.JSON;
import com.zql.biz.TestService;
import com.zql.common.dto.Score;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RestController
@RequestMapping("/test/")
public class Testcontrol {

    @Resource
    private TestService testService;

    @RequestMapping("test")
    public String test(){
        List<Score> scores = testService.scoreList();
        return JSON.toJSONString(scores);
    }
}
