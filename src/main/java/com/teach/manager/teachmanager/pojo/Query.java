package com.teach.manager.teachmanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * @program: teach-interactive-manager
 * @ClassName: Query
 * @description: 封装查询功能参数对象
 * @author: malin
 * @create: 2019-04-17 10:16
 **/

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Query<T> {

    private Integer currentPage = 1;

    private Integer pageSize = 20;

    private T query;

    private String orderByCode;

    private String orderByType = "desc";
}
