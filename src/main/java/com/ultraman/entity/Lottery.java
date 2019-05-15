package com.ultraman.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Lottery implements Serializable {

	private static final long serialVersionUID = 3842685507536594448L;

	private int id;

	private String characterName;

	private double rate;

}