//package io.github.honyariotsdk.core.util;
//
//import com.alibaba.fastjson.JSONObject;
//import com.squareup.okhttp.*;
//import io.github.honyariotsdk.core.model.CommonResponseResult;
//import lombok.extern.slf4j.Slf4j;
//
//import java.io.IOException;
//
//@Slf4j
//public class HttpUtil {
//
//    private static final String URL = "http://localhost:8090/controlscreen/sdk/device/list";
//    private static final MediaType JSON_SET = MediaType.parse("application/json;charset=utf-8");
//
//    public static CommonResponseResult post(Object object){
//        try{
//            RequestBody requestBody = RequestBody.create(JSON_SET, String.valueOf(object));
//            OkHttpClient client = new OkHttpClient();
//            Request request = new Request.Builder()
//                    .url(URL)
//                    .post(requestBody)
//                    .build();
//            Response response = client.newCall(request).execute();
//            return JSONObject.parseObject(response.body().string(),CommonResponseResult.class);
//        }catch (IOException e){
//            log.error("post请求异常,{}",e);
//        }
//       return null;
//    }
//}
