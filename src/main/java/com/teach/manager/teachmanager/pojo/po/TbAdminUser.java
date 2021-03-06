package com.teach.manager.teachmanager.pojo.po;

import java.io.Serializable;
import java.util.Date;

public class TbAdminUser implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.ta_user_id
     *
     * @mbggenerated
     */
    private Integer taUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.ta_user_account
     *
     * @mbggenerated
     */
    private String taUserAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.ta_user_password
     *
     * @mbggenerated
     */
    private String taUserPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.ta_user_del
     *
     * @mbggenerated
     */
    private String taUserDel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.ta_created_date
     *
     * @mbggenerated
     */
    private Date taCreatedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_admin_user.ta_updated_date
     *
     * @mbggenerated
     */
    private Date taUpdatedDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_admin_user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_admin_user.ta_user_id
     *
     * @return the value of tb_admin_user.ta_user_id
     *
     * @mbggenerated
     */
    public Integer getTaUserId() {
        return taUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_admin_user.ta_user_id
     *
     * @param taUserId the value for tb_admin_user.ta_user_id
     *
     * @mbggenerated
     */
    public void setTaUserId(Integer taUserId) {
        this.taUserId = taUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_admin_user.ta_user_account
     *
     * @return the value of tb_admin_user.ta_user_account
     *
     * @mbggenerated
     */
    public String getTaUserAccount() {
        return taUserAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_admin_user.ta_user_account
     *
     * @param taUserAccount the value for tb_admin_user.ta_user_account
     *
     * @mbggenerated
     */
    public void setTaUserAccount(String taUserAccount) {
        this.taUserAccount = taUserAccount == null ? null : taUserAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_admin_user.ta_user_password
     *
     * @return the value of tb_admin_user.ta_user_password
     *
     * @mbggenerated
     */
    public String getTaUserPassword() {
        return taUserPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_admin_user.ta_user_password
     *
     * @param taUserPassword the value for tb_admin_user.ta_user_password
     *
     * @mbggenerated
     */
    public void setTaUserPassword(String taUserPassword) {
        this.taUserPassword = taUserPassword == null ? null : taUserPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_admin_user.ta_user_del
     *
     * @return the value of tb_admin_user.ta_user_del
     *
     * @mbggenerated
     */
    public String getTaUserDel() {
        return taUserDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_admin_user.ta_user_del
     *
     * @param taUserDel the value for tb_admin_user.ta_user_del
     *
     * @mbggenerated
     */
    public void setTaUserDel(String taUserDel) {
        this.taUserDel = taUserDel == null ? null : taUserDel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_admin_user.ta_created_date
     *
     * @return the value of tb_admin_user.ta_created_date
     *
     * @mbggenerated
     */
    public Date getTaCreatedDate() {
        return taCreatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_admin_user.ta_created_date
     *
     * @param taCreatedDate the value for tb_admin_user.ta_created_date
     *
     * @mbggenerated
     */
    public void setTaCreatedDate(Date taCreatedDate) {
        this.taCreatedDate = taCreatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_admin_user.ta_updated_date
     *
     * @return the value of tb_admin_user.ta_updated_date
     *
     * @mbggenerated
     */
    public Date getTaUpdatedDate() {
        return taUpdatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_admin_user.ta_updated_date
     *
     * @param taUpdatedDate the value for tb_admin_user.ta_updated_date
     *
     * @mbggenerated
     */
    public void setTaUpdatedDate(Date taUpdatedDate) {
        this.taUpdatedDate = taUpdatedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_admin_user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taUserId=").append(taUserId);
        sb.append(", taUserAccount=").append(taUserAccount);
        sb.append(", taUserPassword=").append(taUserPassword);
        sb.append(", taUserDel=").append(taUserDel);
        sb.append(", taCreatedDate=").append(taCreatedDate);
        sb.append(", taUpdatedDate=").append(taUpdatedDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}