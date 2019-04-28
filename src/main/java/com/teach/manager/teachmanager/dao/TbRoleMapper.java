package com.teach.manager.teachmanager.dao;

import com.teach.manager.teachmanager.pojo.po.TbRole;
import java.util.List;

public interface TbRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer trRoleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_role
     *
     * @mbggenerated
     */
    int insert(TbRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_role
     *
     * @mbggenerated
     */
    TbRole selectByPrimaryKey(Integer trRoleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_role
     *
     * @mbggenerated
     */
    List<TbRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbRole record);
}