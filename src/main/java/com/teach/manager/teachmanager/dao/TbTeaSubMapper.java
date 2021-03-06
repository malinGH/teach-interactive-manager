package com.teach.manager.teachmanager.dao;

import com.teach.manager.teachmanager.pojo.po.TbTeaSub;
import java.util.List;

public interface TbTeaSubMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tea_sub
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer teaSubId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tea_sub
     *
     * @mbggenerated
     */
    int insert(TbTeaSub record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tea_sub
     *
     * @mbggenerated
     */
    TbTeaSub selectByPrimaryKey(Integer teaSubId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tea_sub
     *
     * @mbggenerated
     */
    List<TbTeaSub> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_tea_sub
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbTeaSub record);
}