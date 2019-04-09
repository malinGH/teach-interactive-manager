package com.teach.manager.teachmanager.dao;

import com.teach.manager.teachmanager.pojo.dos.TbPaper;
import java.util.List;

public interface TbPaperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_paper
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer tpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_paper
     *
     * @mbggenerated
     */
    int insert(TbPaper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_paper
     *
     * @mbggenerated
     */
    TbPaper selectByPrimaryKey(Integer tpId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_paper
     *
     * @mbggenerated
     */
    List<TbPaper> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_paper
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TbPaper record);
}