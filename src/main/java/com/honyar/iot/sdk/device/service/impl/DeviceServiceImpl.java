package com.honyar.iot.sdk.device.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.honyar.iot.sdk.core.model.CommonResponseResult;
import com.honyar.iot.sdk.core.util.HttpUtil;
import com.honyar.iot.sdk.device.service.DeviceService;


/**
 * @description 设备服务
 * @author lidesheng
 * @date 2022/7/12 16:22
 */
public class DeviceServiceImpl implements DeviceService {

    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("PID", "lasdkfjalksdf");
        json.put("homeId", "1232134");
        CommonResponseResult post = HttpUtil.post(json);
        System.out.println(post);
    }
}
