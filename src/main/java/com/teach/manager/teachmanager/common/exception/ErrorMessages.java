package com.teach.manager.teachmanager.common.exception;

/**
 * @program: teach-interactive-manager
 * @ClassName: ErrorMessages
 * @description: 封装返回的信息
 * @author: malin
 * @create: 2019-04-18 10:19
 **/

public enum ErrorMessages {
    /**
     * 包装错误信息
     */
    SUCCESS(200, "成功", "SUCCESS"),
    PARAMS_NOT_FOUND(500, "参数缺失", "PARAMS_NOT_FOUND"),
    SERVICE_ERROR(500, "抱歉服务开小差，请稍后重试", "PARAMS_NOT_FOUND");

    private Integer httpCode;
    private String msg;
    private String mark;

    ErrorMessages(Integer httpCode, String msg, String mark) {
        this.httpCode = httpCode;
        this.msg = msg;
        this.mark = mark;
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public String getMsg() {
        return msg;
    }

    public String getMark() {
        return mark;
    }
}
