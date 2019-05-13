package com.ultraman.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.ToString;

/**
 * 用户会话存储信息
 * 
 * @author MLXF
 *
 */
@Data
@ToString
public class SessionInfo {

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 用户姓名
	 */
	private String userName;

	/**
	 * 用户昵称
	 */
	private String nickName;

	/**
	 * 用户头像地址
	 */
	private String headImg;

	/**
	 * 用户所属机构ID（非学生）
	 */
	private Long schoolId;

	/**
	 * 用户所属机构名称
	 */
	private String schoolName;

	/**
	 * 用户权限列表
	 */
	private ArrayList<Integer> permissionList;

	/**
	 * 用户角色列表
	 */
	private ArrayList<Integer> roleList;

	/**
	 * 学生所属机构ID集合
	 */
	private List<Long> schoolIdList;

	/**
	 * 学生所属项目ID集合
	 */
	private List<String> projectIdList;

}
