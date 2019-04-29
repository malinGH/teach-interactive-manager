package com.teach.manager.teachmanager.controller;

import com.teach.manager.teachmanager.manager.student.StudentManager;
import com.teach.manager.teachmanager.pojo.Page;
import com.teach.manager.teachmanager.pojo.Query;
import com.teach.manager.teachmanager.pojo.Result;
import com.teach.manager.teachmanager.pojo.vo.StudentBaseVo;
import com.teach.manager.teachmanager.pojo.vo.StudentVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: teach-interactive-manager
 * @ClassName: StudentApi
 * @description: 提供学生相关服务接口
 * @author: malin
 * @create: 2019-04-18 19:45
 **/

@RestController
@Slf4j
@RequestMapping(value = "/student_api/base")
@Api(tags = "提供学生相关服务接口")
public class StudentApi {

    @Autowired
    private StudentManager studentManager;

    /**
     * @Description: 根据条件分页查询学生信息
     * @Param1: currentPage
     * @Param2: pageSize
     * @Param3: id
     * @Param4: name
     * @Param5: phone
     * @Param6: orderCode
     * @Param7: orderType
     * @return: com.teach.manager.teachmanager.pojo.Result<com.teach.manager.teachmanager.pojo.Page < com.teach.manager.teachmanager.pojo.vo.StudentVo>>
     * @Author: malin
     * @Date: 2019-04-19
     */
    @RequestMapping(value = "/find_page_query.do", method = RequestMethod.POST)
    @ApiOperation(value = "根据条件分页查询学生信息")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "current_page", value = "当前查询页码", defaultValue = "1"),
            @ApiImplicitParam(name = "page_size", value = "当前查询显示条目数", defaultValue = "20"),
            @ApiImplicitParam(name = "id", value = "学生id查询条件"),
            @ApiImplicitParam(name = "name", value = "学生姓名模糊查询条件"),
            @ApiImplicitParam(name = "phone", value = "学生电话查询条件"),
            @ApiImplicitParam(name = "order_code", value = "查询排序条件字段", defaultValue = "ts_updated_date"),
            @ApiImplicitParam(name = "order_type", value = "查询排序方式", defaultValue = "desc"),
    })
    public Result<Page<StudentVo>> findByQuery(@RequestParam(value = "current_page", required = false) Integer currentPage,
                                               @RequestParam(value = "page_size", required = false) Integer pageSize,
                                               @RequestParam(value = "id", required = false) Integer id,
                                               @RequestParam(value = "name", required = false) String name,
                                               @RequestParam(value = "phone", required = false) String phone,
                                               @RequestParam(value = "order_code", required = false) String orderCode,
                                               @RequestParam(value = "order_type", required = false) String orderType) {
        log.info("[StudentApi,findByQuery]根据条件分页查询学生信息:currentPage={},pageSize={},id={},name={},phone={},orderCode={},orderType={}"
                , currentPage, pageSize, id, name, phone, orderCode, orderType);
        return Result.success(studentManager.findStudentInfoByPage(new Query<>(currentPage, pageSize, new StudentVo(id, name, phone), orderCode, orderType)));
    }

    @PostMapping(value = "/add_info.do")
    @ApiOperation(value = "添加学生相关信息")
    @ResponseBody
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "添加学生姓名"),
            @ApiImplicitParam(name = "phone", value = "添加学生电话"),
    })
    public Result<Object> addInfo(@ModelAttribute StudentBaseVo studentBaseVo) {
        boolean addResult = studentManager.addStudentInfo(studentBaseVo);
        return Result.success(addResult);
    }

}
