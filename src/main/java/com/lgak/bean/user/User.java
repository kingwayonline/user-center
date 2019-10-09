package com.lgak.bean.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "user")
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "MAIL")
    private String mail;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PHONE")
    private Integer phone;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "CITY")
    private Integer city;

}