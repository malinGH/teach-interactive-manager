package com.teach.manager.teachmanager.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @program: teach-interactive-manager
 * @ClassName: StudentVo
 * @description: 封装学生前端展示对象信息
 * @author: malin
 * @create: 2019-04-17 10:21
 **/
@Getter
@Setter
@ToString
public class StudentVo {

    private Integer id;

    private String name;

    private String phone;

    private Date createdDate;

    private Date updatedDate;
}
