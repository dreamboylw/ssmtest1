package com.team1.ssm.util;


import com.alibaba.dubbo.common.json.JSONObject;

/**
 * Created by admin on 2017/5/4.
 */
public class CommonUtil {

    public static com.alibaba.fastjson.JSONObject parseJson(String code, String msg, Object data){
        JSONObject jo = new JSONObject();
        //返回码，1表示成功，2表示失败
        jo.put("result", code);
        //中文提示
        jo.put("msg", msg);
        //返回数据
        jo.put("data", data);
        return jo;
    }
}
