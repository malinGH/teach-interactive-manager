package com.teach.manager.teachmanager.pojo;

import com.teach.manager.teachmanager.common.exception.type.ManagerException;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

import static com.teach.manager.teachmanager.common.exception.ErrorMessages.SUCCESS;
import static com.teach.manager.teachmanager.common.exception.ErrorMessages.SERVICE_ERROR;

/**
 * @program: teach-interactive-manager
 * @ClassName: Result
 * @description: 封装前端返回包装类
 * @author: malin
 * @create: 2019-04-18 09:47
 **/
@Getter
@Setter
@ToString
@ApiModel
public class Result<T> {

    @ApiModelProperty(value = "响应错误码")
    private Integer code;

    @ApiModelProperty(value = "响应数据")
    private T data;

    @ApiModelProperty(value = "响应信息")
    private String msg;

    @ApiModelProperty(value = "响应状态")
    private boolean success;

    @ApiModelProperty(value = "响应唯一标识")
    private String traceId;

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(SUCCESS.getHttpCode());
        result.setMsg(SUCCESS.getMsg());
        result.setData(data);
        result.setSuccess(true);
        result.setTraceId(UUID.randomUUID().toString());
        return result;
    }

    public static <T> Result<T> fail() {
        Result<T> result = new Result<>();
        result.setCode(SERVICE_ERROR.getHttpCode());
        result.setMsg(SERVICE_ERROR.getMsg());
        result.setSuccess(false);
        result.setTraceId(UUID.randomUUID().toString());
        return result;
    }

    public static <T> Result<T> fail(ManagerException me) {
        Result<T> result = new Result<>();
        result.setCode(me.getHttpCode());
        result.setMsg(me.getMsg());
        result.setSuccess(false);
        result.setTraceId(UUID.randomUUID().toString());
        return result;
    }

}
