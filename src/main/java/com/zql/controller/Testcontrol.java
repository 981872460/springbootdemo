package com.zql.controller;

import com.alibaba.fastjson.JSON;
import com.zql.biz.TestService;
import com.zql.biz.handler.BaseHandlerFactory;
import com.zql.biz.handler.DeviceHandler;
import com.zql.common.dto.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static com.sun.javafx.media.PrismMediaFrameHandler.getHandler;

@Controller
@RestController
public class Testcontrol {

    @Resource
    private TestService testService;

    @Resource
    private BaseHandlerFactory baseHandlerFactory;

    @RequestMapping("/test")
    public String test(){
        List<Score> scores = testService.scoreList();
        return JSON.toJSONString(scores);
    }

    @RequestMapping("/test1")
    public String test1(){
        DeviceHandler deviceHandler = (DeviceHandler)baseHandlerFactory.getHandler("test3");
        if(deviceHandler != null)
            deviceHandler.doHandler(new Object());
        else
            System.out.println("你确定你选对了？");
        return "";
    }
}
