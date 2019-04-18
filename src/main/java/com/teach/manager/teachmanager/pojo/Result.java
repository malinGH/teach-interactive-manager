package com.teach.manager.teachmanager.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
public class Result<T> {

    private Integer code;

    private T data;

    private String msg;

    private boolean success;

}
