package com.zql.biz.handler;

public interface BaseHandlerFactory<DeviceHandler> {
    DeviceHandler getHandler(String type);
}
