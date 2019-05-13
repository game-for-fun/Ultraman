package com.ultraman.constant;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public interface CommonConstant {

	/**
	 * 创建者ID
	 * 
	 */
	String CREATE_USER_ID = "create_user_id";

	/**
	 * 创建时间
	 */
	String CREATE_TIME = "create_time";

	/**
	 * 用户ID
	 * 
	 */
	String USER_ID = "userId";

	/**
	 * 用户名
	 */
	String USER_NAME = "userName";

	/**
	 * 是否删除
	 */
	String IS_DELETED = "is_deleted";

	/**
	 * 是否使用
	 */
	String IS_USED = "is_used";

	/**
	 * 数据库id
	 */
	String ID = "_id";

	/**
	 * 查询条件的key值
	 */
	String AIM = "aim";

	/**
	 * 课件的key值
	 */
	String COURSEWARE = "courseware";

	/**
	 * 教学计划的key值
	 */
	String COURSE_PLAN = "coursePlan";

	/**
	 * 课程的key值
	 */
	String COURSE = "course";

	/**
	 * 教案的key值
	 */
	String LESSON = "lesson";

	/**
	 * 标签
	 */
	String LABEL = "label";

	/**
	 * 职员的key值
	 */
	String EMPLOYEE = "employee";

	/**
	 * 教师的key值
	 */
	String TEACHER = "teacher";

	/**
	 * 学习进度的key值
	 */
	String STUDY_SCHEDULE = "studySchedule";

	/**
	 * 授课记录key值
	 */
	String TEACHING = "teaching";

	/**
	 * 订课记录key值
	 */
	String BOOKING = "booking";

	/**
	 * 编码
	 */
	Charset UTF_8 = Charset.forName(StandardCharsets.UTF_8.toString());

	/**
	 *队列监听容器才
	 */
	String JMS_LISTENER_CONTAINER_QUEUE = "jmsListenerContainerQueue";

	/**
	 *主题监听容器
	 */
	String JMS_LISTENER_CONTAINER_TOPIC = "jmsListenerContainerTopic";

	/**
	 * 成功
	 */
	String SUCCESS = "SUCCESS";

	/**
	 * 是
	 */
	String TRUE = "true";

	/**
	 * 否
	 */
	String FALSE = "false";

}
