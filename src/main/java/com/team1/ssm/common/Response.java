package com.team1.ssm.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by admin on 2017/4/27.
 */
@Data
public class Response<T> implements Serializable {
    private boolean success;    //表示调用是否成功，如果为true，则可以调用getResult，如果为false，则调用errorCode来获取出错信息
    private  T result;  //获取调用返回值
    private  String errorCode;  //获取错误码
    private  String errorMsg;   //获取错误信息

    public Response(){

    }

    public Response(T result){
        this.success = true;
        this.result = result;
    }

    public Response(String errorCode,String errorMsg){
        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
