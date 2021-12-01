package com.tongye.cloud.beans;

import lombok.Builder;
import lombok.Data;

/**
 * <p>
 *
 * <p>
 *
 * @Author zhuhanqing
 * @Date 2021/12/1 15:31
 * @Version 1.0.0
 */
@Data
@Builder
public class CommonResult<T> {

    private String message;
    private int code;
    private T data;

    public CommonResult(){
        this.code = 200;
        this.message = "操作成功";
    }

    public CommonResult(String message, int code) {
        this.code = code;
        this.message = message;
    }

    public CommonResult(T data) {
        this.code = 200;
        this.message = "操作成功";
        this.data = data;
    }

    public CommonResult(String message, int code, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
