package com.zql.biz.handler;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;

public class DeviceHandlerFactory<DeviceHandler> implements BaseHandlerFactory{

    private Map<String, DeviceHandler> handlerMap;

    @Override
    public DeviceHandler getHandler(String type) {
        if(StringUtils.isEmpty(type)){
            System.out.println("传个空的搞鸡毛啊！");
        }
        return handlerMap.get(type);
    }

    public void setHandlerMap(Map<String, DeviceHandler> handlerMap) {
        this.handlerMap = handlerMap;
    }
}
