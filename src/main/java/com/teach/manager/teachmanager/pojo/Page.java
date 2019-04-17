package com.teach.manager.teachmanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @program: teach-interactive-manager
 * @ClassName: Page
 * @description: 分页信息封装类
 * @author: malin
 * @create: 2019-04-17 10:14
 **/

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Page<T> {

    private Integer currentPage;

    private Integer totalCount;

    private Integer pageSize;

    private List<T> pageInfo;
}
