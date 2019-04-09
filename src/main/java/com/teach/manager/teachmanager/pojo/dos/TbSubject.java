package com.teach.manager.teachmanager.pojo.dos;

import java.io.Serializable;

public class TbSubject implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_subject.tsu_id
     *
     * @mbggenerated
     */
    private Integer tsuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_subject.tsu_name
     *
     * @mbggenerated
     */
    private String tsuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_subject.tsu_id
     *
     * @return the value of tb_subject.tsu_id
     *
     * @mbggenerated
     */
    public Integer getTsuId() {
        return tsuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_subject.tsu_id
     *
     * @param tsuId the value for tb_subject.tsu_id
     *
     * @mbggenerated
     */
    public void setTsuId(Integer tsuId) {
        this.tsuId = tsuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_subject.tsu_name
     *
     * @return the value of tb_subject.tsu_name
     *
     * @mbggenerated
     */
    public String getTsuName() {
        return tsuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_subject.tsu_name
     *
     * @param tsuName the value for tb_subject.tsu_name
     *
     * @mbggenerated
     */
    public void setTsuName(String tsuName) {
        this.tsuName = tsuName == null ? null : tsuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_subject
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tsuId=").append(tsuId);
        sb.append(", tsuName=").append(tsuName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}