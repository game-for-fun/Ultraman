package com.ultraman.constant;

public interface QueueName {

	/**
	 * 更新导学测试
	 */
	String UPDATE_GUIDANCE_EXAM = "updateGuidanceExam";

	/**
	 * 更新入学测试
	 */
	String UPDATE_PLACEMENT_EXAM = "updatePlacementExam";

	/**
	 * 更新自学
	 */
	String UPDATE_EXERCISES = "updateExercises";

	/**
	 * 更新上课
	 */
	String UPDATE_TEACHING = "updateTeaching";

	/**
	 * 更新作业
	 */
	String UPDATE_HOMEWORK = "updateHomework";

	/**
	 * 更新对教师授课评价
	 */
	String UPDATE_EVAL_TEACHING = "updateEvalTeaching";

	/**
	 * 更新对作业批改评价
	 */
	String UPDATE_EVAL_CORRECT = "updateEvalCorrect";

	/**
	 * 更新对学生评价
	 */
	String UPDATE_EVAL_STUDENT = "updateEvalStudent";

	/**
	 * 更新阶段测试
	 */
	String UPDATE_STAGE_EXAM = "updateStageExam";

	/**
	 * 更新结业评价
	 */
	String UPDATE_FINAL_EVAL = "updateFinalEval";

	/**
	 * 更新结业测试
	 */
	String UPDATE_FINAL_EXAM = "updateFinalExam";

	/**
	 * 更新试卷状态为未批改状态
	 */
	String NOTCORRECTED = "updateExamToNotCorrected";

	/**
	 * 更新评价
	 */
	String QUEUE_STUDY_EVALUATE = "queueStudyEvaluate";

	/**
	 * 更新教务学生数统计
	 */
	String SYNC_TUTOR_STUDENT_STATICS = "syncTutorStudentStatics";

	/**
	 * 课件转换队列名称
	 */
	String QUEUE_CHANGE_COURSEWARE = "queueChangeCoureware";

	/**
	 * 创建机构队列
	 */
	String QUEUE_SCHOLL_ADMIN_REGIST = "queueSchollAdminRegist";

	/**
	 * 入学测试
	 */
	String QUEUE_PRODUCE_ENTRANCE_EXAM_MESSAGE = "queueProduceEntranceExamMessage";

	/**
	 * 学生请假课时顺延成功
	 */
	String QUEUE_PRODUCE_LEAVE_MESSAGE = "queueProduceLeaveMessage";

	/**
	 * 老师推送可选时间
	 */
	String QUEUE_PRODUCE_PUSH_TIME_MESSAGE = "queueProducePushTimeMessage";

	/**
	 * 上课提醒
	 */
	String QUEUE_PRODUCE_ATTEND_CLASS_MESSAGE = "queueProduceAttendClassMessage";

	/**
	 * 老师调整上课时间
	 */
	String QUEUE_PRODUCE_ADJUST_TIME_MESSAGE = "queueProduceAdjustTimeMessage";

	/**
	 * 老师手动点缺席
	 */
	String QUEUE_PRODUCE_ABSENT_MESSAGE = "queueProduceAbsentMessage";

	/**
	 * 教师批改作业提交成功
	 */
	String QUEUE_PRODUCE_CORRECT_WORK_MESSAGE = "queueProduceCorrectWorkMessage";

	/**
	 * 上课结束时间到
	 */
	String QUEUE_PRODUCE_CLASS_OVER_MESSAGE = "queueProduceClassOverMessage";

	/**
	 * 作业已批改
	 */
	String QUEUE_PRODUCE_WORK_CORRECTED_MESSAGE = "queueProduceWorkCorrectedMessage";

	/**
	 * 教务推送跟进问卷
	 */
	String QUEUE_PRODUCE_COACH_MESSAGE = "queueProduceCoachMessage";

	/**
	 * 学员取消一对一自选课程
	 */
	String QUEUE_PRODUCE_CANCEL_MESSAGE = "queueProduceCancelMessage";

	/**
	 * 学员提交作业成功
	 */
	String QUEUE_PRODUCE_SUBMIT_WORK_MESSAGE = "queueProduceSubmitWorkMessage";

	/**
	 * 上课时间调整（固定课一对一管理员进行上课） 发给学生
	 */
	String QUEUE_PRODUCE_ADMIN_ADJUST_TIME_MESSAGE = "queueProduceAdminAdjustTimeMessage";

	/**
	 * 同步教务名称和昵称
	 */
	String SYNC_TUTOR_NAME = "syncTutorName";

	/**
	 * 接收编辑教师的队列
	 */
	String QUEUE_TEACHER_UPDATE_PROJECT = "queueTeacherUpdateProject";

	/**
	 * 修改教学计划通知队列
	 */
	String QUEUE_MODIFY_COURSE_PLAN = "queueModifyCoursePaln";

	/**
	 * 排教学计划通知队列
	 */
	String QUEUE_ADD_COURSE_PLAN = "queueAddCoursePaln";

	/**
	 * 学员选好时间通知队列
	 */
	String QUEUE_STU_CHOOSE_TIME = "queueStuChooseTime";

	/**
	 * 时间不合适通知队列
	 */
	String QUEUE_TIME_IMPROPER = "queueTimeImproper";

	/**
	 * 新增职员队列名称
	 */
	public static final String QUEUE_EMPLOYEE_INSERT = "queueEmployeeInsert";

	/**
	 * 删除职员队列名称
	 */
	public static final String QUEUE_EMPLOYEE_DELETE = "queueEmployeeRemove";

	/**
	 * 修改职员队列名称
	 */
	public static final String QUEUE_EMPLOYEE_MODIFY = "queueEmployeeUpdate";

	/**
	 * 批量导入老师列名称
	 */
	public static final String QUEUE_TEACHER_IMPORT = "queueTeacherImport";

	/**
	 * 批量导入职员列名称
	 */
	public static final String QUEUE_EMPLOYEE_IMPORT = "queueEmployeeImport";

	/**
	 * 新增老师队列名称
	 */
	public static final String QUEUE_TEACHER_INSERT = "queueTeacherInsert";

	/**
	 * 删除老师队列名称
	 */
	public static final String QUEUE_TEACHER_DELETE = "queueTeacherRemove";

	/**
	 * 修改联系人队列名称
	 */
	public static final String QUEUE_ADMIN_MODIFY = "queueAdminModify";

	/**
	 * 修改老师队列名称
	 */
	public static final String QUEUE_TEACHER_MODIFY = "queueTeacherUpdate";

}
