package com.teach.manager.teachmanager.manager.student.impl;

import com.teach.manager.teachmanager.common.exception.ErrorMessages;
import com.teach.manager.teachmanager.common.exception.type.ManagerException;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Date;
import java.util.Objects;

/**
 * @program: teach-interactive-manager
 * @ClassName: StudentMapperUtil
 * @description: 封装student的mapper中处理信息的方法
 * @author: malin
 * @create: 2019-04-18 10:11
 **/
@Component
@Slf4j
public class StudentMapperUtil {

    @Qualifier
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.CLASS)
    public @interface CheckParams {

    }

    @CheckParams
    public <T> T checkParams(T obj) {
        if (Objects.isNull(obj)) {
            log.error("[StudentMapperUtil,checkParams]参数校验失败");
            throw new ManagerException(ErrorMessages.PARAMS_NOT_FOUND);
        }
        return obj;
    }

}
