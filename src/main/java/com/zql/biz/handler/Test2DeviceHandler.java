package com.zql.biz.handler;

import com.zql.common.dto.Score;

import java.util.List;

public class Test2DeviceHandler extends DeviceHandler {
    @Override
    public void doHandler(Object object) {
        List<Score> scoreList = super.getScoreList("hahaha");
        System.out.println("Test2DeviceHandler");
    }
}
