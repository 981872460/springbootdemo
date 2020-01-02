package com.zql.biz.handler;

import com.zql.biz.TestService;
import com.zql.common.dto.Score;

import javax.annotation.Resource;
import java.util.List;

public abstract class DeviceHandler {

    @Resource
    private TestService testService;

    public abstract void doHandler(Object object);

    public List<Score> getScoreList(String str){
        System.out.println("输出===="+str);
        return testService.scoreList();
    }
}
