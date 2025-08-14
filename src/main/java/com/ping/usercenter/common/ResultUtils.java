package com.ping.usercenter.common;

/**
 * 返回工具类
 *
 * @author ping
 */
public class ResultUtils {

    /**
     * 成功
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse success(T data) {
        return new BaseResponse<>(0,data,"ok");
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode.getCode(),null,
                errorCode.getMessage(), errorCode.getDescription());
        //也可以写 return BaseResponse<>(errorCode); 一样的
    }
}
