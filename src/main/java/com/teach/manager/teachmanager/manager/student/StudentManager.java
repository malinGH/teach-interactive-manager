package com.teach.manager.teachmanager.manager.student;

import com.teach.manager.teachmanager.pojo.Page;
import com.teach.manager.teachmanager.pojo.Query;
import com.teach.manager.teachmanager.pojo.vo.StudentBaseVo;
import com.teach.manager.teachmanager.pojo.vo.StudentVo;

/**
 * @program: teach-interactive-manager
 * @InterfaceName: StudentManager
 * @description: 学生功能的相关处理
 * @author: malin
 * @create: 2019-04-17 10:10
 **/

public interface StudentManager {

    /**
     * @Description: 获取学生信息
     * @Param1: query
     * @return: com.teach.manager.teachmanager.pojo.Page<com.teach.manager.teachmanager.pojo.vo.StudentVo>
     * @Author: malin
     * @Date: 2019-04-17
     */
    Page<StudentVo> findStudentInfoByPage(Query<StudentVo> query);

    /**
     * @Description: 添加学生信息
     * @Param1: studentBaseVo
     * @return: boolean
     * @Author: malin
     * @Date: 2019-04-18
     */
    boolean addStudentInfo(StudentBaseVo studentBaseVo);
}
