package com.teach.manager.teachmanager.manager.student;

import com.teach.manager.teachmanager.manager.student.impl.StudentMapperUtil;
import com.teach.manager.teachmanager.pojo.po.TbStudent;
import com.teach.manager.teachmanager.pojo.vo.StudentBaseVo;
import com.teach.manager.teachmanager.pojo.vo.StudentVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @program: teach-interactive-manager
 * @InterfaceName: StudentMapper
 * @description: 学生类型转换接口
 * @author: malin
 * @create: 2019-04-17 14:50
 **/
@Mapper(componentModel = "spring", uses = StudentMapperUtil.class)
public interface StudentMapper {

    /**
     * @Description: 学生对象do转换层vo
     * @Param1: tbStudent
     * @return: com.teach.manager.teachmanager.pojo.vo.StudentVo
     * @Author: malin
     * @Date: 2019-04-17
     */
    @Mapping(source = "tsId", target = "id")
    @Mapping(source = "tsName", target = "name")
    @Mapping(source = "tsPhone", target = "phone")
    @Mapping(source = "tsCreatedDate", target = "createdDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    @Mapping(source = "tsUpdatedDate", target = "updatedDate", dateFormat = "yyyy-MM-dd HH:mm:ss")
    StudentVo studentDoToVo(TbStudent tbStudent);

    @Mapping(source = "name", target = "tsName", qualifiedBy = StudentMapperUtil.CheckParams.class)
    @Mapping(source = "phone", target = "tsPhone", qualifiedBy = StudentMapperUtil.CheckParams.class)
    @Mapping(target = "tsDel", constant = "0")
    @Mapping(target = "tsCreatedDate", expression = "java(new java.util.Date())")
    @Mapping(target = "tsUpdatedDate", expression = "java(new java.util.Date())")
    TbStudent studentVoToDo(StudentBaseVo studentBaseVo);

}
