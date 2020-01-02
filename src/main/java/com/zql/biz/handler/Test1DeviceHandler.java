package com.zql.biz.handler;

import com.zql.common.dto.Score;

import java.util.List;

public class Test1DeviceHandler extends DeviceHandler {
    @Override
    public void doHandler(Object object) {
        List<Score> scoreList = super.getScoreList("nimei");
        System.out.println("Test1DeviceHandler");
    }
}
