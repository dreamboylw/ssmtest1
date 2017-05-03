package com.team1.ssm.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Table(name = "tb_user")
public class UserDo {
    /**
     * 会员id
     */
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    /**
     * 会员名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 会员性别:0代表男，1代表女
     */
    @Column(name = "USER_SEX")
    private String userSex;

    /**
     * 登录密码
     */
    @Column(name = "PASS_WORD")
    private String passWord;

    /**
     * 手机号码
     */
    @Column(name = "USER_PHONE")
    private String userPhone;

    /**
     * 真实名字
     */
    @Column(name = "REAL_NAME")
    private String realName;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 会员类型：1：游客用户 0：注册会员用户
     */
    @Column(name = "USER_TYPE")
    private String userType;

    /**
     * 状态 1:可用状态  0:删除状态  2:锁定状态
     */
    @Column(name = "STATE")
    private String state;

    /**
     * 创建人ID
     */
    @Column(name = "CREATE_BY")
    private Long createBy;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 修改人ID
     */
    @Column(name = "UPDATE_BY")
    private Long updateBy;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_DATE")
    private Date updateDate;

}