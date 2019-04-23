package com.teach.manager.teachmanager.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: teach-interactive-manager
 * @ClassName: StudentBaseVo
 * @description: 封装学生基本添加信息
 * @author: malin
 * @create: 2019-04-23 18:18
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentBaseVo {

    private String name;

    private String phone;
}
