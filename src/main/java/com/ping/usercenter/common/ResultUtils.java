package com.ping.usercenter.common;

/**
 * 返回工具类
 *
 * @author ping
 */
public class ResultUtils {

    public static <T> BaseResponse success(T data) {
        return new BaseResponse<>(0,data,"ok");
    }
}
