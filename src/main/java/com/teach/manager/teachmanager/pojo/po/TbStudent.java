package com.teach.manager.teachmanager.pojo.po;

import java.io.Serializable;
import java.util.Date;

public class TbStudent implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_student.ts_id
     *
     * @mbggenerated
     */
    private Integer tsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_student.ts_name
     *
     * @mbggenerated
     */
    private String tsName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_student.ts_phone
     *
     * @mbggenerated
     */
    private String tsPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_student.ts_del
     *
     * @mbggenerated
     */
    private String tsDel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_student.ts_created_date
     *
     * @mbggenerated
     */
    private Date tsCreatedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_student.ts_updated_date
     *
     * @mbggenerated
     */
    private Date tsUpdatedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_student.ts_id
     *
     * @return the value of tb_student.ts_id
     *
     * @mbggenerated
     */
    public Integer getTsId() {
        return tsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_student.ts_id
     *
     * @param tsId the value for tb_student.ts_id
     *
     * @mbggenerated
     */
    public void setTsId(Integer tsId) {
        this.tsId = tsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_student.ts_name
     *
     * @return the value of tb_student.ts_name
     *
     * @mbggenerated
     */
    public String getTsName() {
        return tsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_student.ts_name
     *
     * @param tsName the value for tb_student.ts_name
     *
     * @mbggenerated
     */
    public void setTsName(String tsName) {
        this.tsName = tsName == null ? null : tsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_student.ts_phone
     *
     * @return the value of tb_student.ts_phone
     *
     * @mbggenerated
     */
    public String getTsPhone() {
        return tsPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_student.ts_phone
     *
     * @param tsPhone the value for tb_student.ts_phone
     *
     * @mbggenerated
     */
    public void setTsPhone(String tsPhone) {
        this.tsPhone = tsPhone == null ? null : tsPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_student.ts_del
     *
     * @return the value of tb_student.ts_del
     *
     * @mbggenerated
     */
    public String getTsDel() {
        return tsDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_student.ts_del
     *
     * @param tsDel the value for tb_student.ts_del
     *
     * @mbggenerated
     */
    public void setTsDel(String tsDel) {
        this.tsDel = tsDel == null ? null : tsDel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_student.ts_created_date
     *
     * @return the value of tb_student.ts_created_date
     *
     * @mbggenerated
     */
    public Date getTsCreatedDate() {
        return tsCreatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_student.ts_created_date
     *
     * @param tsCreatedDate the value for tb_student.ts_created_date
     *
     * @mbggenerated
     */
    public void setTsCreatedDate(Date tsCreatedDate) {
        this.tsCreatedDate = tsCreatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_student.ts_updated_date
     *
     * @return the value of tb_student.ts_updated_date
     *
     * @mbggenerated
     */
    public Date getTsUpdatedDate() {
        return tsUpdatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_student.ts_updated_date
     *
     * @param tsUpdatedDate the value for tb_student.ts_updated_date
     *
     * @mbggenerated
     */
    public void setTsUpdatedDate(Date tsUpdatedDate) {
        this.tsUpdatedDate = tsUpdatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_student
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tsId=").append(tsId);
        sb.append(", tsName=").append(tsName);
        sb.append(", tsPhone=").append(tsPhone);
        sb.append(", tsDel=").append(tsDel);
        sb.append(", tsCreatedDate=").append(tsCreatedDate);
        sb.append(", tsUpdatedDate=").append(tsUpdatedDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}