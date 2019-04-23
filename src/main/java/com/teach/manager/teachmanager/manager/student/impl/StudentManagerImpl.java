package com.teach.manager.teachmanager.manager.student.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.teach.manager.teachmanager.dao.TbStudentMapper;
import com.teach.manager.teachmanager.manager.student.StudentManager;
import com.teach.manager.teachmanager.manager.student.StudentMapper;
import com.teach.manager.teachmanager.pojo.Page;
import com.teach.manager.teachmanager.pojo.Query;
import com.teach.manager.teachmanager.pojo.po.TbStudent;
import com.teach.manager.teachmanager.pojo.vo.StudentBaseVo;
import com.teach.manager.teachmanager.pojo.vo.StudentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @program: teach-interactive-manager
 * @ClassName: StudentManagerImpl
 * @description: 学生服务的处理
 * @author: malin
 * @create: 2019-04-17 10:10
 **/
@Service
@Slf4j
public class StudentManagerImpl implements StudentManager {

    @Autowired
    private TbStudentMapper tbStudentMapper;

    @Autowired
    private StudentMapper studentMapper;

    private static final int DEFAULT_PAGE_SIZE = 20;

    private static final int DEFAULT_CURRENT_PAGE = 1;

    private static final String DEFAULT_ORDER_BY_CODE = "ts_updated_date";

    private static final String DEFAULT_ORDER_BY_TYPE = "desc";

    /**
     * @Description: 获取学生信息
     * @Param1: query
     * @return: com.teach.manager.teachmanager.pojo.Page<com.teach.manager.teachmanager.pojo.vo.StudentVo>
     * @Author: malin
     * @Date: 2019-04-17
     */
    @Override
    public Page<StudentVo> findStudentInfoByPage(Query<StudentVo> query) {
        log.info("[StudentManagerImpl,findStudentInfoByPage]查询学生信息:query={}", JSONObject.toJSONString(query));
        Integer currentPage = Optional.ofNullable(query).map(Query::getCurrentPage).orElse(DEFAULT_CURRENT_PAGE);
        Integer pageSize = Optional.ofNullable(query).map(q -> getDefaultPageSize(q.getPageSize())).orElse(DEFAULT_PAGE_SIZE);
        StudentVo studentQuery = Optional.ofNullable(query).map(Query::getQuery).orElse(new StudentVo());
        String orderByCode = Optional.ofNullable(query).map(Query::getOrderByCode).orElse(DEFAULT_ORDER_BY_CODE);
        String orderByType = Optional.ofNullable(query).map(Query::getOrderByType).orElse(DEFAULT_ORDER_BY_TYPE);
        int pageCount = getPageCount(currentPage, pageSize);
        List<TbStudent> studentDos;
        int totalCount = 0;
        try {
            log.info("[StudentManagerImpl,findStudentInfoByPage]查询学生信息条件:queryMap={}", JSONObject.toJSONString(studentQuery));
            studentDos = tbStudentMapper.findAllByPage(pageCount, pageSize, studentQuery, orderByCode, orderByType);
            totalCount = tbStudentMapper.findStudentCount(studentQuery);
            List<StudentVo> studentVos = studentDos.parallelStream().map(tbStudent -> studentMapper.studentDoToVo(tbStudent)).collect(Collectors.toList());
            return new Page<>(currentPage, totalCount, pageSize, studentVos);
        } catch (Exception e) {
            log.error("[StudentManagerImpl,findStudentInfoByPage]查询学生信息异常:query={}", JSONObject.toJSONString(query), e);
            return new Page<>(currentPage, totalCount, pageSize, Lists.newArrayList());
        }
    }

    /**
     * @Description: 获取默认页数信息
     * @Param1: pageSize
     * @return: int
     * @Author: malin
     * @Date: 2019-04-17
     */
    private int getDefaultPageSize(Integer pageSize) {
        if (Objects.isNull(pageSize)) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        if (pageSize > DEFAULT_PAGE_SIZE) {
            return DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }

    /**
     * @Description: 获取查询行数
     * @Param1: currentPage
     * @Param2: pageSize
     * @return: int
     * @Author: malin
     * @Date: 2019-04-17
     */
    private int getPageCount(Integer currentPage, Integer pageSize) {
        return (currentPage - 1) * pageSize;
    }

    /**
     * @Description: 添加学生信息
     * @Param1: studentVo
     * @return: boolean
     * @Author: malin
     * @Date: 2019-04-18
     */
    @Override
    public boolean addStudentInfo(StudentBaseVo studentBaseVo) {
        log.info("[StudentManagerImpl,addStudentInfo]添加学生信息:studentBaseVo={}", JSONObject.toJSONString(studentBaseVo));
        if (Objects.isNull(studentBaseVo)) {
            log.error("[StudentManagerImpl,addStudentInfo]添加学生信息为空");
            return false;
        }
        TbStudent tbStudent = studentMapper.studentVoToDo(studentBaseVo);
        try {
            log.info("[StudentManagerImpl,addStudentInfo]添加学生信息:tbStudent={}", JSONObject.toJSONString(tbStudent));
            tbStudentMapper.insert(tbStudent);
            return true;
        } catch (Exception e) {
            log.error("[StudentManagerImpl,addStudentInfo]添加学生信息异常:studentVo={}", JSONObject.toJSONString(studentBaseVo), e);
            return false;
        }
    }

}
