package com.teach.manager.teachmanager.pojo.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @program: teach-interactive-manager
 * @ClassName: StudentVo
 * @description: 封装学生前端展示对象信息
 * @author: malin
 * @create: 2019-04-17 10:21
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class StudentVo extends StudentBaseVo {

    private Integer id;

    private String createdDate;

    private String updatedDate;

    public StudentVo(Integer id, String name, String phone) {
        super(name, phone);
        this.id = id;
    }
}
