package com.teach.manager.teachmanager.controller;

import com.teach.manager.teachmanager.manager.student.StudentManager;
import com.teach.manager.teachmanager.pojo.Page;
import com.teach.manager.teachmanager.pojo.Query;
import com.teach.manager.teachmanager.pojo.vo.StudentVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: teach-interactive-manager
 * @ClassName: StudentApi
 * @description: 提供学生相关服务接口
 * @author: malin
 * @create: 2019-04-18 19:45
 **/

@Controller
@Slf4j
@RequestMapping(value = "/student_api/base")
@Api(value = "提供学生相关服务接口")
public class StudentApi {

    @Autowired
    private StudentManager studentManager;

    @RequestMapping("/find_page_query")
    @ApiOperation(value = "根据条件分页查询学生信息", httpMethod = "POST")
    @ResponseBody
    public Page<StudentVo> findByQuery(@Param(value = "current_page") @ApiParam(value = "当前查询页码", defaultValue = "1") Integer currentPage,
                                       @Param(value = "page_size") @ApiParam(value = "当前查询显示条目数", defaultValue = "20") Integer pageSize,
                                       @Param(value = "id") @ApiParam(value = "学生id查询条件") Integer id,
                                       @Param(value = "name") @ApiParam(value = "学生姓名模糊查询条件") String name,
                                       @Param(value = "phone") @ApiParam(value = "学生电话查询条件") String phone,
                                       @Param(value = "order_code") @ApiParam(value = "查询排序条件字段", defaultValue = "ts_updated_date") String orderCode,
                                       @Param(value = "order_type") @ApiParam(value = "查询排序方式", defaultValue = "desc") String orderType) {
        log.info("[StudentApi,findByQuery]根据条件分页查询学生信息:currentPage={},pageSize={},id={},name={},phone={},orderCode={},orderType={}"
                , currentPage, pageSize, id, name, phone, orderCode, orderType);
        return studentManager.findStudentInfoByPage(new Query<>(currentPage, pageSize, new StudentVo(id, name, phone), orderCode, orderType));
    }

}
