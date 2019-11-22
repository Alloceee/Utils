package com.utils.excel.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    @Excel(name = "ID")
    private Integer id;

    @Excel(name = "姓名")
    private String name;

    @Excel(name = "年龄")
    private Integer age;

    @Excel(name = "地址")
    private String address;

    @Excel(name = "邮箱")
    private String email;

    @Excel(name = "QQ")
    private String qq;

    @Excel(name = "电话")
    private String phone;

}
