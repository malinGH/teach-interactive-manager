package com.teach.manager.teachmanager.dao;

import com.teach.manager.teachmanager.pojo.po.TbSubject;
import java.util.List;

public interface TbSubjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer tsuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    int insert(TbSubject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    TbSubject selectByPrimaryKey(Integer tsuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    List<TbSubject> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbSubject record);
}