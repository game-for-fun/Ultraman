package com.ultraman.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String userName;

	private String nickName;

	private int vip;

	private int level;

	private int money;

	private int rmb;

	private int score;

	private String userImg;

	private Date registTime;

}