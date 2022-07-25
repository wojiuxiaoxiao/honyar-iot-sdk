package io.github.honyariotsdk.device.service.impl;

import com.alibaba.fastjson.JSONObject;
import io.github.honyariotsdk.core.model.CommonResponseResult;
import io.github.honyariotsdk.core.util.HttpUtil;
import io.github.honyariotsdk.device.service.DeviceService;


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
