package com.teach.manager.teachmanager.common.exception.type;

import static com.teach.manager.teachmanager.common.exception.ErrorMessages.PARAMS_NOT_FOUND;

import com.teach.manager.teachmanager.common.exception.ErrorMessages;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

/**
 * @program: teach-interactive-manager
 * @ClassName: ManagerException
 * @description: 业务异常信息自定义封装
 * @author: malin
 * @create: 2019-04-18 10:27
 **/
@Getter
@Setter
@ToString
public class ManagerException extends RuntimeException {

    private Integer httpCode;

    private String msg;

    private String mark;

    public ManagerException() {
    }

    public ManagerException(String msg) {
        this(PARAMS_NOT_FOUND.getHttpCode(), msg);
    }

    public ManagerException(Integer httpCode) {
        this(httpCode, null);
    }

    public ManagerException(Integer httpCode, String msg) {
        this(httpCode, msg, null);
    }

    public ManagerException(ErrorMessages errorMessages) {
        this(errorMessages.getHttpCode(), errorMessages.getMsg(), errorMessages.getMark());
    }

    public ManagerException(Integer httpCode, String msg, String mark) {
        this.httpCode = httpCode;
        this.msg = msg;
        this.mark = mark;
    }


}
