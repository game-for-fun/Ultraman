package com.ultraman.constant;

/**
 * @description 消息码定义接口
 * @author gjw
 * @date 2018年6月15日
 */
public interface MessageCode {

	/**
	 * 执行成功
	 */
	String EXECUTE_SUCCESS = "1000";

	/**
	 * 对象不存在
	 */
	String OBJECT_NOT_EXIST = "1002";

	/**
	 * 用户不存在
	 */
	String USER_NOT_EXIST = "1003";

	/**
	 * 用户Id不可以为空
	 */
	String USER_ID_IS_NOT_NULL = "1004";

	/**
	 * 页号不合法
	 */
	String PAGENO_INVALID = "1005";

	/**
	 * 分页大小不合法
	 */
	String PAGESIZE_INVALID = "1006";

	/**
	 * 不合法的objecId
	 */
	String INVALID_OBJECTID = "1007";

	/**
	 * 不合法的数组长度
	 */
	String INVALID_ARRAY_LENGTH = "1008";

	/**
	 * 开始时间不可以为空
	 */
	String START_TIME_IS_NOT_NULL = "1009";

	/**
	 * 结束时间不可以为空
	 */
	String END_TIME_IS_NOT_NULL = "1010";

	/**
	 * 越界异常
	 */
	String INDEX_OUT_OF_BOUNDS = "1011";

	/**
	 * 权限不足
	 */
	String INSUFFICIENT_AUTHORITY = "1012";

	/**
	 * 系统错误
	 */
	String SYSTEM_ERROR = "2000";
	/**
	 * 未知错误
	 */
	String UNKNOWN_ERROR = "2001";
	/**
	 * 数据库错误
	 */
	String DATABASE_ERROR = "2002";
	/**
	 * 未填写答案项
	 */
	String ANSWER_ERROR = "2003";
	/**
	 * 导入文件格式不对
	 */
	String IMPORT_ERROR = "2004";
	/**
	 * 导入文件过大
	 */
	String SIZE_ERROR = "2005";
	/**
	 * 取消共享因人不同失败
	 */
	String NOOPENED_ERROR = "2006";

	/**
	 * 不合法的参数
	 */
	String ILLEGAL_PARAMETER = "2008";

	/**
	 * 表格内容为空，导出失败
	 */
	String EXPORT_IS_NOT_NULL = "2009";

	/**
	 * 不合法的访问
	 */
	String ILLEGAL_ACCESS = "2010";

	/**
	 * 导入Excel异常
	 */
	String IMPORT_EXCEL_ERROR = "2012";

	// --------------题目模块开始----------------------

	/**
	 * 题目存储必填项不全
	 */
	String QUESTION_NOT_ENOUGH = "3001";

	/**
	 * 题目id不可以为空
	 */
	String QUESTION_IS_NOT_NULL = "3002";

	/**
	 * 分享习题失败
	 */
	String SHARE_EXAMQUESTION_FAIL = "3003";

	// --------------题目模块结束---------------------

	// ---------------试卷模块开始--------------------

	/**
	 * 题库id不可以为空
	 */
	String LIBID_IS_NOT_NULL = "4001";

	/**
	 * 获取试卷标签失败
	 */
	String GET_LABEL_FAIL = "4002";

	/**
	 * 查询试卷失败
	 */
	String SEARCH_EXAMPAPER_FAIL = "4003";

	/**
	 * 新增试卷对象不可以为空
	 */
	String EXAMPAPER_IS_NOT_NULL = "4004";

	/**
	 * 新增试卷失败
	 */
	String ADD_EXAMPAPER_FAIL = "4005";

	/**
	 * 更新试卷失败
	 */
	String UPDATE_EXAMPAPER_FAIL = "4006";

	/**
	 * 删除试卷失败
	 */
	String DELETE_EXAMPAPER_FAIL = "4007";

	/**
	 * 试卷id不可以为空
	 */
	String PAPERID_IS_NOT_NULL = "4008";

	/**
	 * 复制试卷失败
	 */
	String COPY_EXAMPAPER_FAIL = "4009";

	/**
	 * 取消试卷共享失败
	 */
	String CANCEL_SHARE_EXAMPAPER_FAIL = "4010";

	/**
	 * 试卷已经加入到对应题库中
	 */
	String PAPER_UNDER_LIB = "4011";

	/**
	 * 待更新的试卷不存在
	 */
	String PAPER_IS_NOT_EXISTS = "4012";

	// ---------------试卷模块结束-------------------

	// ---------------答卷模块开始--------------------
	/**
	 * 答卷ID不可以为空
	 */
	String ANSWERPAPERID_IS_NOT_NULL = "5001";

	/**
	 * 查询答卷失败
	 */
	String SEARCH_EXAMANSWERPAPER_FAIL = "5002";

	/**
	 * 新增/更新答卷对象不可以为空
	 */
	String EXAMANSWERPAPER_IS_NOT_NULL = "5003";

	/**
	 * 习题的题组号或题号或id或分数不存在
	 */
	String QUESTION_INFO_NOT_EXIST = "5004";

	/**
	 * 答题信息不能为空
	 */
	String ANSWERQUESTION_IS_NOT_NULL = "5005";

	/**
	 * 更新习题已使用状态
	 */
	String UPDATE_QUESTION_USED_FAIL = "5006";

	// ---------------答卷模块结束-------------------

	// ---------------制作中心模块开始-------------------

	/**
	 * 机构id不可以为空
	 */
	String SCHOOL_ID_IS_NOT_NULL = "7001";

	/**
	 * 启用状态不可以为空
	 */
	String USE_STATUS_IS_NOT_NULL = "7002";

	/**
	 * 课程封面不可以为空
	 */
	String COVER_IMG_IS_NOT_NULL = "7003";

	/**
	 * 课程对象不可以为空
	 */
	String COURSE_OBJECT_IS_NOT_NULL = "7004";

	/**
	 * 分类id不可以为空
	 */
	String CATEGORY_ID_IS_NOT_NULL = "7005";

	/**
	 * 课件类型不可以为空
	 */
	String COURSEWARE_TYPE_IS_NOT_NULL = "7006";

	/**
	 * 课程名称不可以为空
	 */
	String FULL_NAME_IS_NOT_NULL = "7007";

	/**
	 * 课程简称不可以为空
	 */
	String SHORT_NAME_IS_NOT_NULL = "7008";

	/**
	 * 需要至少包含一个教案和一个教学计划后才能启用课程
	 */
	String UNABLE_TO_ENABLE_COURSE = "7009";

	/**
	 * 启用/禁用失败
	 */
	String CHANGE_USE_STATE_FAILED = "7010";

	/**
	 * 只有从未被启用过的课程才可被删除
	 */
	String DELETE_ON_ERROR_STATUS = "7011";

	/**
	 * 课程名称不可以重复
	 */
	String FULL_NAME_IS_EXIST = "7012";

	/**
	 * 课程简称不可以重复
	 */
	String SHORT_NAME_IS_EXIST = "7013";

	/**
	 * 机构id不正确
	 */
	String SCHOOL_ID_IS_WRONG = "7014";

	/**
	 * 文件的key不能为空
	 */
	String FILE_KEY_IS_NOT_NULL = "7015";

	/**
	 * 您上传的课件名称与已有课件重复，请改名后上传
	 */
	String COURSEWARE_NAME_IS_EXIST = "7016";

	/**
	 * 教学计划id不能为空
	 */
	String COURSE_PLAN_ID_IS_NOT_NULL = "7017";

	/**
	 * 教学计划名称不能为空
	 */
	String COURSE_PLAN_NAME_IS_NOT_NULL = "7018";

	/**
	 * 适用等级不能为空
	 */
	String LEVEL_IS_NOT_NULL = "7019";

	// ---------------制作中心模块结束--------------------
	/**
	 * 课件id不可以为空
	 */
	String COURSEWARE_ID_IS_NOT_NULL = "6001";

	/**
	 * 课件对象不可以为空
	 */
	String COURSEWARE_IS_NOT_NULL = "6002";

	/**
	 * 课件名称不可以为空
	 */
	String COURSEWARE_NAME_IS_NOT_NULL = "6003";

	/**
	 * 课件名称已存在
	 */
	String COURSEWARE_NAME_IS_EXISTS = "6004";

	/**
	 * 最多上传一个文件
	 */
	String UPLOAD_MAX_ONE = "6005";

	/**
	 * 教案id不可以为空
	 */
	String LESSON_ID_IS_NOT_NULL = "6006";

	/**
	 * 教案对象不可以为空
	 */
	String LESSON_IS_NOT_NULL = "6007";

	/**
	 * 教案名称不可以为空
	 */
	String LESSON_NAME_IS_NOT_NULL = "6008";

	/**
	 * 教案名称已存在
	 */
	String LESSON_NAME_IS_EXISTS = "6009";

	/**
	 * 课程id不可以为空
	 */
	String COURSE_ID_IS_NOT_NULL = "6010";

	/**
	 * 课程分类名称已存在
	 */
	String CATEGORY_NAME_IS_EXISTS = "7102";

	/**
	 * 课程分类名称不可以为空
	 */
	String CATEGORY_NAME_NOT_NULL = "7101";

	/**
	 * 课程分类名称已使用
	 */
	String CATEGORY_NAME_IS_USED = "7111";

	/**
	 * 父分类不可以删除
	 */
	String PARENT_CATEGORY_CAN_NOT_DELETE = "7103";

	/**
	 * 机构id不可以为空
	 */
	String SCHOOL_ID_MUST_NOT_BE_NULL = "7104";

	/**
	 * 课程已使用
	 */
	String CATEGORY_IS_USED = "7105";

	/**
	 * 教学计划id不可以为空
	 */
	String COURSEPLAN_ID_IS_NOT_NULL = "7106";

	/**
	 * 教学计划名称不可以为空
	 */
	String COURSEPLAN_NAME_IS_NOT_NULL = "7107";

	/**
	 * 教学计划名称已存在
	 */
	String COURSEPLAN_NAME_IS_EXISTS = "7108";

	/**
	 * 已启用的教案不可以删除
	 */
	String USED_LESSON_CAN_NOT_BE_DELETED = "7110";

	/**
	 * 课程分类最多创建层数
	 */
	String CATEGORY_MAX_LEVEL = "2011";

	/**
	 * 课程等级已存在
	 */
	String COURSE_LEVEL_IS_EXISTS = "7112";

	/**
	 * 课程等级最多20个
	 */
	String COURSE_MAX_LEVEL = "7113";

	// ---------------职员模块开始--------------------

	/**
	 * 职员对象不可以为空
	 */
	String EMPLOYEE_OBJECT_IS_NOT_NULL = "8001";

	/**
	 * 职员ID不可以为空
	 */
	String EMPLOYEE_ID_IS_NOT_NULL = "8002";

	/**
	 * 职员不存在
	 */
	String EMPLOYEE_IS_NOT_EXISTS = "8003";

	/**
	 * 第{0}行, 姓名不可以为空
	 */
	String EMPLOYEE_NAME_IS_NOT_NULL = "8004";

	/**
	 * 第{0}行, 姓名(长度不能超过20个字符)
	 */
	String EMPLOYEE_NAME_IS_TOO_LONG = "8005";

	/**
	 * 第{0}行, 昵称(长度不能超过10个字符)
	 */
	String EMPLOYEE_NICK_NAME_IS_TOO_LONG = "8006";

	/**
	 * 第{0}行, 性别 (格式不正确)
	 */
	String EMPLOYEE_SEX_TYPE_ERROR = "8007";

	/**
	 * 第{0}行, 出生日期(格式不正确)
	 */
	String EMPLOYEE_BIRTYDAY_TYPE_ERROR = "8008";

	/**
	 * 第{0}行, 运营管理(格式不正确)
	 */
	String EMPLOYEE_TWO_TYPE_ERROR = "8009";

	/**
	 * 第{0}行, 课程研发(格式不正确)
	 */
	String EMPLOYEE_FIVE_TYPE_ERROR = "8010";

	/**
	 * 第{0}行, 项目管理(格式不正确)
	 */
	String EMPLOYEE_THREE_TYPE_ERROR = "8011";

	/**
	 * 第{0}行, 教务(格式不正确)
	 */
	String EMPLOYEE_SIX_TYPE_ERROR = "8012";

	/**
	 * 第{0}行, 教师管理(格式不正确)
	 */
	String EMPLOYEE_FOUR_TYPE_ERROR = "8013";

	/**
	 * 第{0}行, 证件类型 (格式不正确)
	 */
	String CARD_TYPE_ERROR = "8014";

	/**
	 * 第{0}行, 证件号码 (不能为空)
	 */
	String CARD_IS_NOT_NULL = "8015";

	/**
	 * 第{0}行, 证件号码 (长度不能超过20个字符)
	 */
	String CARD_NO_IS_TOO_LONG = "8016";

	/**
	 * 第{0}行, 证件号码 (格式不正确)
	 */
	String CARD_NO_TYPE_ERROR = "8017";

	/**
	 * 第{0}行, 合同开始时间(格式不正确)
	 */
	String CONTRACT_START_DATE_TYPE_ERROR = "8018";

	/**
	 * 第{0}行, 合同结束时间(格式不正确)
	 */
	String CONTRACT_END_DATE_TYPE_ERROR = "8019";

	/**
	 * 第{0}行, 合同开始时间不能大于合同结束时间
	 */
	String CONTRACT_START_DATE_CAN_NOT_MORE_THAN_END_DATE = "8020";

	/**
	 * 第{0}行, 授权(必填)
	 */
	String AUTH_IS_NOT_NULL = "8021";

	// ---------------职员模块结束--------------------

	// ---------------教师模块开始--------------------
	/**
	 * 教师对象不可以为空
	 */
	String TEACHER_OBJECT_IS_NOT_NULL = "9001";

	/**
	 * 教师ID不可以为空
	 */
	String TEACHER_ID_IS_NOT_NULL = "9002";

	/**
	 * 教师分组对象不可以为空
	 */
	String TEACHER_GROUP_OBJECT_IS_NOT_NULL = "9003";
	/**
	 * 教师分组ID不可以为空
	 */
	String GROUP_ID_IS_NOT_NULL = "9004";

	/**
	 * 教师昵称已存在
	 */
	String NICK_NAME_IS_EXISTS = "9005";

	/**
	 * 证件号已存在
	 */
	String CERTIFICATE_NO_IS_EXISTS = "9006";

	/**
	 * 手机号已存在
	 */
	String MOBILE_IS_EXISTE = "9007";

	/**
	 * 邮箱已存在
	 */
	String EMAIL_IS_EXISTS = "9008";

	/**
	 * 收款账户已存在
	 */
	String SETTLEMENTACCOUNT_IS_EXISTS = "9009";

	/**
	 * 微信号已存在
	 */
	String WECHAT_IS_EXISTS = "9010";

	/**
	 * Skype已经存在
	 */
	String SKYPE_IS_EXISTS = "9011";

	/**
	 * 昵称(长度不能超过50个字符)
	 */
	String TEACHER_NICK_NAME_IS_TOO_LONG = "9012";

	/**
	 * 第{0}行, 所在地 (长度不能超过20个字符)
	 */
	String AREA_IS_TO_LONG = "9013";

	/**
	 * 第{0}行, WeChat(长度不能超过50个字符)
	 */
	String WECHAT_IS_TO_LONG = "9014";

	/**
	 * 第{0}行, Skype(长度不能超过50个字符)
	 */
	String SKYPE_IS_TO_LONG = "9015";

	/**
	 * 第{0}行, 账户类型(格式不正确)
	 */
	String ACCOUNT_TYPE_ERROE = "9016";

	/**
	 * 第{0}行, 账户号码(长度不能超过50个字符)
	 */
	String ACCOUNT_IS_TO_LONG = "9017";

	/**
	 * 第{0}行, 入职时间(格式不正确)
	 */
	String ENTRY_DATE_TYPE_ERROR = "9018";

	/**
	 * 第{0}行, 培训状态(格式不正确)
	 */
	String TRAIN_STATUS_TYPE_ERROR = "9019";

	/**
	 * 第{0}行, 排课级别(格式不正确)
	 */
	String PRIORITY_TYPE_ERROR = "9020";

	/**
	 * 第{0}行, 姓名(长度不能超过50个字符)
	 */
	String TEACHER_NAME_IS_TOO_LONG = "9021";

	// ---------------教师模块结束--------------------

	// ---------------用户模块开始--------------------
	/**
	 * 用户注册信息不全
	 */
	String USER_INFO_IS_NOT_NULL = "10001";
	/**
	 * 用户不能为空
	 */
	String USER_IS_NOT_NULL = "10002";
	/**
	 * 用户ID不能为空
	 */
	String USERID_IS_NOT_NULL = "10003";
	/**
	 * 用户绑定信息不全
	 */
	String USER_BIND_INFO_IS_NOT_NULL = "10004";
	/**
	 * 传参错误
	 */
	String USER_WX_AUTH_PARAM_ERROR = "10005";
	/**
	 * 不合法的用户
	 */
	String ILLEGAL_USER = "10006";
	/**
	 * 用户登录信息不全
	 */
	String USER_LOGIN_INFO_IS_NOT_NULL = "10007";
	/**
	 * 删除用户参数不全
	 */
	String USER_DELETE_PARAM_IS_NOT_FULL = "10008";
	/**
	 * 会话已失效，请从新登录
	 */
	String USER_LOGIN_INFO_IS_EXPIRE = "10009";
	/**
	 * 用户密码不能为空
	 */
	String USER_PASSWORD_IS_NOT_NULL = "10010";
	/**
	 * 该邮箱已存在，请核实并重新输入
	 */
	String USER_ALREADY_EXISIT = "10011";
	/**
	 * 密码不正确
	 */
	String USER_LOGIN_PASSWORD_WRONG = "10012";
	/**
	 * 该手机号码已存在，请核实并重新输入。
	 */
	String USER_MOBILE_IS_EXISTS = "10013";
	/**
	 * 登录失败，用户名或密码输入错误
	 */
	String USER_NAME_OR_PASSWORD_WRONG = "10014";
	/**
	 * 登录失败
	 */
	String USER_LOGIN_FAILED = "10015";
	/**
	 * 操作过于频繁，请明天再试
	 */
	String REQUEST_TOO_OFTEN = "10016";
	/**
	 * 请输入验证码
	 */
	String VALID_CODE_NOT_NULL = "10017";
	/**
	 * 验证码已失效，请重新获取
	 */
	String VALID_CODE_EXPIRED = "10018";
	/**
	 * 非法访问
	 */
	String INVALID_ACCESS = "10019";
	/**
	 * 验证码错误，请输入正确的验证码
	 */
	String VALID_CODE_WRONG = "10020";
	/**
	 * 密码修改失败
	 */
	String UPDATE_PASS_FAIL = "10021";

	// ---------------用户模块结束--------------------

	// ---------------机构（学校）模块开始--------------------
	/**
	 * 学校认证信息不全
	 */
	String SCHOOL_INF0_IS_NOT_NULL = "11001";
	/**
	 * 营业执照不能为空
	 */
	String SCHOOL_LICENSE_IS_NOT_NULL = "11002";
	/**
	 * 文件下载路径不能为空
	 */
	String SCHOOL_LICENSE_DOWNLOAD_URL_IS_NOT_NULL = "11003";
	/**
	 * 修改的学校认证信息不能为空
	 */
	String SCHOOL_INFO_MODIFIED_IS_NOT_NULL = "11004";
	/**
	 * 请输入未通过理由
	 */
	String SCHOOL_REJECT_REASON_IS_NOT_NULL = "11005";
	/**
	 * 该机构已经存在
	 */
	String SCHOOL_NAME_IS_EXIST = "11006";
	/**
	 * 您所属的机构已经被禁用
	 */
	String SCHOOL_IS_FROBIDEN = "11007";
	/**
	 * 您所属的机构不存在
	 */
	String SCHOOL_IS_DELETED = "11008";
	/**
	 * 您的试用资格已到期
	 */
	String SCHOOL_IS_EXPIRED = "11009";

	/**
	 * 老师时间不存在
	 */
	String TEACHER_OPEN_TIME_NOT_EXISTS = "11010";
	// ---------------机构（学校）模块结束--------------------

	// ---------------习题模块开始--------------------

	/**
	 * 习题的切换方式不能为空
	 */
	String SWITCH_QUESTION_IS_NOT_NULL = "12001";

	/**
	 * 操作方式不能为空
	 */
	String OPERATION_IS_NOT_NULL = "12002";

	/**
	 * 答卷不能为空
	 */
	String EXAM_ANSWER_PAPER_IS_NOT_NULL = "12003";

	/**
	 * 答卷id不能为空
	 */
	String EXAM_ANSWER_PAPER_ID_IS_NOT_NULL = "12004";

	/**
	 * 题目id不能为空
	 */
	String QUESTION_ID_IS_NOT_NULL = "12005";

	/**
	 * 试卷id不能为空
	 */
	String PAPER_ID_IS_NOT_NULL = "12006";

	/**
	 * 表名不能为空
	 */
	String TABLE_NAME_IS_NOT_NULL = "12007";

	/**
	 * 题库id不能为空
	 */
	String LIB_ID_IS_NOT_NULL = "12008";

	/**
	 * 请输入题干
	 */
	String QUESTION_TEXT_IS_NOT_NULL = "12009";

	/**
	 * 难易度不能为空
	 */
	String DIFFICULTY_IS_NOT_NULL = "12010";

	/**
	 * 选项长度超出限制
	 */
	String OPTION_LENGTH_IS_OVER_LIMIT = "12011";

	/**
	 * 题干长度超出限制
	 */
	String QUESTION_TEXT_LENGTH_IS_OVER_LIMIT = "12012";

	/**
	 * 习题正确答案不能为空
	 */
	String ANSWER_TEXT_IS_NOT_NULL = "12013";

	/**
	 * 文档提示长度超出限制
	 */
	String REFCONTENT_LENGTH_IS_OVER_LIMIT = "12014";

	/**
	 * 答案解析长度超出限制
	 */
	String ANALYSIS_LENGTH_IS_OVER_LIMIT = "12015";

	/**
	 * 单个标签长度超限
	 */
	String LAYBEL_LENGTH_IS_OVER_LIMIT = "12016";

	/**
	 * 至少要有2个选项
	 */
	String AT_LEAST_TWO_OPTION = "12017";

	/**
	 * 单选题有且只有1个正确答案
	 */
	String ONLY_ONE_CORRECT_OPTION = "12018";

	/**
	 * 答案或选项序号应为大写字母
	 */
	String SHOULD_BE_UPPPER_CASE = "12019";

	/**
	 * 多选题正确答案不能少于2个
	 */
	String AT_LEAST_TWO_CORRECT_OPTION = "12020";

	/**
	 * 请检查答案序号与选项序号是否一致
	 */
	String THE_NUMBERS_DONT_MATCH = "12021";

	/**
	 * 至少要有3个选项
	 */
	String AT_LEAST_THREE_OPTION = "12022";

	/**
	 * 判断题有且只有一个正确答案选项
	 */
	String AT_LEAST_ONE_CORRECT_OPTION = "12023";

	/**
	 * 答案与选项内容不一致
	 */
	String THE_ANSWER_DONT_MATCH_OPTION = "12024";

	/**
	 * 选项有重复项
	 */
	String DUPLICATE_OPTION = "12025";

	/**
	 * 答案有重复项
	 */
	String DUPLICATE_ANSWER = "12026";

	// ---------------习题模块结束--------------------

	// ---------------项目模块开始--------------------

	/**
	 * 项目对象不可以为空
	 */
	String PROJECT_OBJECT_IS_NOT_NULL = "13001";

	/**
	 * 项目学生对象不可以为空
	 */
	String PROJECT_STUDENT_OBJECT_IS_NOT_NULL = "13002";

	/**
	 * 企业客户ID（订单ID）不可以为空
	 */
	String PROJECT_CUSTOMER_ID_IS_NOT_NULL = "13003";

	/**
	 * 企业客户名称不可以为空
	 */
	String PROJECT_CUSTOMER_NAME_IS_NOT_NULL = "13004";

	/**
	 * 合同号（订单号）不可以为空
	 */
	String PROJECT_CONTRACT_NO_IS_NOT_NULL = "13005";

	/**
	 * 合同摘要（订单备注）不可以为空
	 */
	String PROJECT_CONTRACT_SUMARY_IS_NOT_NULL = "13006";

	/**
	 * 客户行业（所属行业）不可以为空
	 */
	String PROJECT_CUSTOMER_INDUSTRY_IS_NOT_NULL = "13007";

	/**
	 * 客户类型不可以为空
	 */
	String PROJECT_CUSTOMER_TYPE_IS_NOT_NULL = "13008";

	/**
	 * 总课次数不可以为空
	 */
	String PROJECT_LESSON_NUM_IS_NOT_NULL = "13009";

	/**
	 * 选课模式不可以为空
	 */
	String PROJECT_BOOK_TYPE_IS_NOT_NULL = "13010";

	/**
	 * 学习周期不可以为空
	 */
	String PROJECT_TERM_MONTHS_IS_NOT_NULL = "13011";

	/**
	 * 费用类型不可以为空
	 */
	String PROJECT_PAY_TYPE_IS_NOT_NULL = "13012";

	/**
	 * 项目名称不可以为空
	 */
	String PROJECT_NAME_IS_NOT_NULL = "13013";

	/**
	 * 项目经理ID不可以为空
	 */
	String PROJECT_PM_ID_IS_NOT_NULL = "13014";

	/**
	 * 项目经理名称不可以为空
	 */
	String PROJECT_PM_NAME_IS_NOT_NULL = "13015";

	/**
	 * 教务ID不可以为空
	 */
	String PROJECT_TUTOR_ID_IS_NOT_NULL = "13016";

	/**
	 * 教务名称不可以为空
	 */
	String PROJECT_TUTOR_NAME_IS_NOT_NULL = "13017";

	/**
	 * 开始时间不可以为空
	 */
	String PROJECT_START_DATE_IS_NOT_NULL = "13018";

	/**
	 * 结束时间不可以为空
	 */
	String PROJECT_END_DATE_IS_NOT_NULL = "13019";

	/**
	 * 第{0}行, 学生姓名不可以为空
	 */
	String PROJECT_STUDENT_NAME_IS_NOT_NULL = "13020";

	/**
	 * 第{0}行, 电子邮箱不可以为空
	 */
	String PROJECT_EMAIL_IS_NOT_NULL = "13021";

	/**
	 * 第{0}行, 手机号码不可以为空
	 */
	String PROJECT_MOBILE_PHONE_IS_NOT_NULL = "13022";

	/**
	 * 项目ID不可以为空
	 */
	String PROJECT_ID_IS_NOT_NULL = "13023";

	/**
	 * 项目名称不可以重复
	 */
	String PROJECT_NAME_IS_EXIST = "13024";

	/**
	 * 第{0}行, 输入的数据与已保存数据重复，请核实(手机)
	 */
	String PROJECT_IMPORT_MOBILE_IS_EXIST = "13025";

	/**
	 * 传入文件类型错误
	 */
	String PROJECT_IMPORT_FILE_TYPE_ERROR = "13026";

	/**
	 * 传入文件错误
	 */
	String PROJECT_IMPORT_FILE_ERROR = "13027";

	/**
	 * 表格内容为空，导入失败
	 */
	String PROJECT_IMPORT_FILE_NULL = "13028";

	/**
	 * 第{0}行, 输入的数据重复，请核实(邮箱)
	 */
	String PROJECT_IMPORT_INPUT_EMAIL_EXIST = "13029";

	/**
	 * 第{0}行, 输入的数据重复，请核实(手机)
	 */
	String PROJECT_IMPORT_INPUT_MOBILE_EXIST = "13030";

	/**
	 * 第{0}行, 学生昵称不可以为空
	 */
	String PROJECT_STUDENT_NICK_NAME_IS_NOT_NULL = "13031";

	/**
	 * 第{0}行, 学生姓名(长度不能超过30个字符)
	 */
	String PROJECT_STUDENT_NAME_IS_TOO_LONG = "13032";

	/**
	 * 第{0}行, 昵称(长度不能超过30个字符)
	 */
	String PROJECT_STUDENT_NICK_NAME_IS_TOO_LONG = "13033";

	/**
	 * 第{0}行, 电子邮箱(长度不能超过50个字符)
	 */
	String PROJECT_STUDENT_EMAIL_IS_TOO_LONG = "13034";

	/**
	 * 第{0}行, 电子邮箱(格式不正确)
	 */
	String PROJECT_STUDENT_EMAIL_TYPE_ERROR = "13035";

	/**
	 * 第{0}行, 手机号(格式不正确)
	 */
	String PROJECT_STUDENT_MOBILE_TYPE_ERROR = "13036";

	/**
	 * 第{0}行, 所在部门(长度不能超过20个字符)
	 */
	String PROJECT_STUDENT_DEPARTMENT_IS_TOO_LONG = "13037";

	/**
	 * 第{0}行, 所任职位(长度不能超过20个字符)
	 */
	String PROJECT_STUDENT_POSITION_IS_TOO_LONG = "13038";

	/**
	 * 第{0}行, 督学1用户名(长度不能超过30个字符)
	 */
	String PROJECT_STUDENT_NAME1_IS_TOO_LONG = "13039";

	/**
	 * 第{0}行, 督学1手机号(格式不正确)
	 */
	String PROJECT_STUDENT_PHONE1_TYPE_ERROR = "13040";

	/**
	 * 第{0}行, 督学1电子邮箱(长度不能超过50个字符)
	 */
	String PROJECT_STUDENT_EMAIL1_IS_TOO_LONG = "13041";

	/**
	 * 第{0}行, 督学1电子邮箱(格式不正确)
	 */
	String PROJECT_STUDENT_EMAIL1_TYPE_ERROR = "13042";

	/**
	 * 第{0}行, 督学2用户名(长度不能超过30个字符)
	 */
	String PROJECT_STUDENT_NAME2_IS_TOO_LONG = "13043";

	/**
	 * 第{0}行, 督学2手机号(格式不正确)
	 */
	String PROJECT_STUDENT_PHONE2_TYPE_ERROR = "13044";

	/**
	 * 第{0}行, 督学2电子邮箱(长度不能超过50个字符)
	 */
	String PROJECT_STUDENT_EMAIL2_IS_TOO_LONG = "13045";

	/**
	 * 第{0}行, 督学2电子邮箱(格式不正确)
	 */
	String PROJECT_STUDENT_EMAIL2_TYPE_ERROR = "13046";

	/**
	 * 第{0}行, 督学3用户名(长度不能超过30个字符)
	 */
	String PROJECT_STUDENT_NAME3_IS_TOO_LONG = "13047";

	/**
	 * 第{0}行, 督学3手机号(格式不正确)
	 */
	String PROJECT_STUDENT_PHONE3_TYPE_ERROR = "13048";

	/**
	 * 第{0}行, 督学3电子邮箱(长度不能超过50个字符)
	 */
	String PROJECT_STUDENT_EMAIL3_IS_TOO_LONG = "13049";

	/**
	 * 第{0}行, 督学3电子邮箱(格式不正确)
	 */
	String PROJECT_STUDENT_EMAIL3_TYPE_ERROR = "13050";

	/**
	 * 邮箱不能重复，请重新输入
	 */
	String PROJECT_EMAIL_EXIST = "13051";

	/**
	 * 手机号不能重复，请重新输入
	 */
	String PROJECT_MOBILE_EXIST = "13052";

	/**
	 * 学生姓名(格式不正确)
	 */
	String PROJECT_STUDENT_NAME_TYPE_ERROR = "13053";

	/**
	 * 学生id不可以为空
	 */
	String STUDENT_ID_IS_NOT_EMPTY = "13054";

	/**
	 * 学生教案创建失败
	 */
	String COURSEPLAN_CREATE_FAIL = "13055";

	/**
	 * 该名称已存在，请重新设置班级名称
	 */
	String PROJECT_CLASS_NAME_EXIST = "13056";

	/**
	 * 第{0}行, 督学1邮箱不能为空
	 */
	String PROJECT_STUDENT_EMAIL1_IS_NOT_NULL = "13057";

	/**
	 * 第{0}行, 督学2邮箱不能为空
	 */
	String PROJECT_STUDENT_EMAIL2_IS_NOT_NULL = "13058";

	/**
	 * 第{0}行, 督学3邮箱不能为空
	 */
	String PROJECT_STUDENT_EMAIL3_IS_NOT_NULL = "13059";

	/**
	 * 第{0}行, 输入的数据与已保存数据重复，请核实(邮箱)
	 */
	String PROJECT_IMPORT_EMAIL_IS_EXIST = "13060";

	/**
	 * 授课模式不可以为空
	 */
	String PROJECT_TEACHING_MODE_IS_NOT_NULL = "13061";

	/**
	 * 学生状态不可以为空
	 */
	String PROJECT_STUDENT_STATUS_IS_NOT_NULL = "13062";

	/**
	 * 您不是运营和教务,不能修改学员信息
	 */
	String PROJECT_STUDENT_NOT_MODIFY = "13063";

	/**
	 * 您不是运营和教务,不能删除学员信息
	 */
	String PROJECT_STUDENT_NOT_DELETE = "13064";

	/**
	 * 订课时间不能为空
	 */
	String PROJECT_BOOKTIME_NOT_MODIFY = "13065";

	/**
	 * 订课选的次数不对
	 */
	String PROJECT_BOOKTIME_TIEMES_INCORRECT = "13066";

	/**
	 * 学生教学计划为空
	 */
	String PROJECT_STUDENT_COURSE_PLAN_IS_NULL = "13067";

	/**
	 * 订的课程不是一对一固定自选课
	 */
	String PROJECT_NOT_FIXED_OPINAL_COURSES = "13068";

	/**
	 * 项目未开始
	 */
	String PROJECT_NOT_START = "13069";

	/**
	 * 项目已结束
	 */
	String PROJECT_IS_END = "13070";

	/**
	 * 项目授课次数不一致
	 */
	String PROJECT_TEACHING_NOT_AGREEMENT = "13071";

	/**
	 * 无法删除班级内的全部学员
	 */
	String PROJECT_STUDENT_NOT_DELETE_ALL = "13072";

	/**
	 * 订课时间已被预定，请重新选择时间
	 */
	String PROJECT_TIME_ALREADY_BOOKED = "13073";

	/**
	 * 班级不能为空
	 */
	String PROJECT_CLASS_NOT_NULL = "13074";

	/**
	 * 该班级没有项目学生
	 */
	String PROJECT_CLASS_NOT_EXIST = "13075";

	/**
	 * 订的课程不是一对多固定自选课
	 */
	String PROJECT_NOT_FIXED_ONE_TO_MANY_COURSES = "13076";

	/**
	 * 你选择的课程时间,已被预订
	 */
	String PROJECT_TEACHER_TIME_ALREADY_BOOKED = "13077";

	/**
	 * 当前教学计划课次数与项目总课次数不符，请重新编辑
	 */
	String LESSON_NUM_DONT_MATCH_LESSON_TOTAL = "13078";

	/**
	 * 当前教学计划上课次数与项目上课次数不符，请重新编辑
	 */
	String TEACHING_NUM_DONT_MATCH_TEACHING_LESSON_TOTAL = "13079";

	/**
	 * 该学生已有学习数据，无法删除
	 */
	String PROJECT_STUDENT_EXISTS_SCHEDULE = "13080";

	/**
	 * 已删除没有学习数据的学员
	 */
	String PROJECT_STUDENT_WITHOUT_LEARNING_DATA_HAVE_BEEN_DELETED = "13081";

	/**
	 * 选中的学员已有学习数据，无法被删除
	 */
	String PROJECT_STUDENT_HAVE_LEARNING_DATA_CANNOT_NOT_DELETE = "13082";

	/**
	 * 第{0}行, 督学1邮箱与已保存数据重复，请核实
	 */
	String PROJECT_STUDENT_EMAIL1_IS_EXIST = "13083";

	/**
	 * 第{0}行, 督学2邮箱与已保存数据重复，请核实
	 */
	String PROJECT_STUDENT_EMAIL2_IS_EXIST = "13084";

	/**
	 * 第{0}行, 督学3邮箱与已保存数据重复，请核实
	 */
	String PROJECT_STUDENT_EMAIL3_IS_EXIST = "13085";

	/**
	 * 改期的时间不能在该授课时间之前
	 */
	String PROJECT_CHANGDATETIME_BEFORE_TEACHINGTIME = "13086";

	/**
	 * 选择的课程不是一对一固定课
	 */
	String PROJECT_SELECT_NOT_FIXED_OPINAL_COURSES = "13087";

	/**
	 * 项目课程和教学计划课程不一致
	 */
	String PROJECT_COURSE_NOT_MATCH_COURSEPLAN_COURSE = "13088";

	/**
	 * 原教学计划和新教学计划教案剩余类型不一致
	 */
	String OLD_LESSON_AND_NEW_LESSON_ORDER_NOT_MATCH = "13089";

	/**
	 * 原教学计划和新教学计划阶段剩余测试试卷列表不一致
	 */
	String OLD_LESSON_AND_NEW_LESSON_NUMBER_NOT_MATCH = "13090";

	/**
	 * 过去的课程不能顺延
	 */
	String OLD_LESSON_NOT_POSTPOND = "13091";

	/**
	 * 已完成评价
	 */
	String COMPLETE_EVAL = "13092";

	/**
	 * 上课时间已无效
	 */
	String NO_TIME_TO_BOOK = "13101";

	/**
	 * 第{0}行, 手机号码(长度不能超过30个字符)
	 */
	String PROJECT_STUDENT_MOBILE_PHONE_IS_TOO_LONG = "13102";

	/**
	 * 该老师不是该项目课程老师
	 */
	String NO_PROJECT_COURSE_TEACHER = "13103";

	/**
	 * 当前时间已被预订，请联系老师处理
	 */
	String TIME_HAS_BEEN_BOOKED = "13104";

	/**
	 * 选择的项目不是一对一固定课项目或者无上课项目
	 */
	String PROJECT_NOT_CHANGE_TEACHER = "13105";

	/**
	 * 无授课次数不能换教学计划
	 */
	String PROJECT_NO_TEACHING_NOT_CHANGE_COURSEPLAN = "13106";

	// ---------------项目模块结束--------------------

	// ---------------学习模块开始--------------------

	/**
	 * 没有这个学生的学习进度
	 */
	String STUDENT_STUDYSCHEDULE_IS_NOT_EXIST = "14001";

	/**
	 * 本月可订课次不足，无法预约
	 */
	String LESSON_NUM_IS_NOT_ENOUGH = "14002";

	/**
	 * 预约名额不足
	 */
	String INSUFFICIENT_PLACES = "14003";

	/**
	 * 本节课已经结束
	 */
	String THIS_LESSON_IS_OVER = "14004";

	/**
	 * 没有可带本课程的老师
	 */
	String NO_TEACHER_FOR_THIS_COURSE = "14005";

	/**
	 * 开放时间已关闭，请重新选择
	 */
	String OPENTIME_IS_CLOSED = "14006";

	/**
	 * 已选时间已被他人选定，请重新选择
	 */
	String ALREADY_SELECTED_BY_OTHERS = "14007";

	/**
	 * 没有可订次数
	 */
	String LESSON_NUM_NOT_ENOUGH = "14008";

	/**
	 * 授课id不可以为空
	 */
	String TEACHING_IS_NOT_NULL = "14009";

	/**
	 * 课程已删除，无法预约
	 */
	String LESSON_ALREADY_DELETE_UNABLE_APPOINTMENT = "14010";

	/**
	 * 不允许请假
	 */
	String NO_LEAVE_ALLOWED = "14011";

	/**
	 * 取消机会已用完
	 */
	String OPPORTUNITIES_ARE_EXHAUSTED = "14012";

	/**
	 * TeachingId不可以为空
	 */
	String TEACHING_ID_IS_NOT_EMPTY = "14013";

	/**
	 * 学生的学习进度中没有这节课的信息
	 */
	String NO_TEACHING_INFO = "14014";

	/**
	 * 项目未开始，无法预约
	 */
	String PROJECT_IS_NOT_START = "14015";

	/**
	 * 请假机会已用完
	 */
	String CHANCES_ARE_EXHAUSTED = "14016";

	/**
	 * 顺延将超期，不能顺延
	 */
	String POSTPONED_TIME_BIG_PROJECT_ENDTIME = "14017";

	/**
	 * 顺延时间与教师时间有冲突，不能顺延
	 */
	String POSTPONED_TIME_CONFLICT_TEACHER_TIME = "14018";

	/**
	 * 顺延时间与教师开放时间有冲突，不能顺延
	 */
	String OPEN_TIME_CONFLICT_TEACHER_TIME = "14019";

	/**
	 * 改期时间与教师开放时间有冲突，不能改期
	 */
	String CHANG_TIME_CONFLICT_TEACHER_TIME = "14020";

	/**
	 * 没有设老师开放时间
	 */
	String NOT_SET_TEACHER_OPEN_TIME = "14021";

	/**
	 * 改期时间将超期，不能改期
	 */
	String CHANG_TIME_BIG_PROJECT_ENDTIME = "14022";

	/**
	 * 学习进度中授课信息有误
	 */
	String STUDY_SCHEDULE_ERROR_INFO = "14023";

	/**
	 * 已经预约
	 */
	String IS_ALREADY_SALE = "14024";

	// ---------------学习模块结束--------------------

	// ---------------消息模块开始--------------------

	/**
	 * 公告内容不全
	 */
	String NOTICE_PARAMS_NOT_FULL = "15001";
	/**
	 * 公告不存在
	 */
	String NOTICE_NOT_EXIST = "15002";

	/**
	 * 请假消息提示
	 */
	String LEAVE_MESSAGE = "15003";

	/**
	 * 管理端端订课消息提示
	 */
	String BOOK_MESSAGE = "15004";

	// ---------------消息模块结束--------------------

	// ---------------发布模块开始--------------------

	/**
	 * 发布对象不能为空
	 */
	String PUBLISHING_OBJECT_IS_NOT_NULL = "16001";

	/**
	 * 课次不足，无法预约
	 */
	String INSUFFICIENT_CLASSES = "16002";

	/**
	 * 预约名额不足
	 */
	String INSUFFICIENT_RESERVATIONS = "16003";

	/**
	 * 发布对象已被报名，不能编辑
	 */
	String PUBLISHING_ALREADY_APPLYED = "16004";

	/**
	 * 封面不能为空
	 */
	String PUBLISHING_CORVER_NOT_EMPTY = "16005";

	/**
	 * 上课开始时间不能为空
	 */
	String PUBLISHING_STARTTIME_NOT_EMPTY = "16006";

	/**
	 * 上课结束时间不能为空
	 */
	String PUBLISHING_ENDTIME_NOT_EMPTY = "16007";

	/**
	 * 上课时常不能为0
	 */
	String PUBLISHING_CLASSLENGTH_NOT_ZERO = "16008";

	/**
	 * 讲师不能为空
	 */
	String PUBLISHING_TEACHER_NOT_EMPTY = "16009";

	/**
	 * 标题不能为空
	 */
	String PUBLISHING_TITLE_NOT_EMPTY = "16010";

	/**
	 * 非法数据
	 */
	String PUBLISHING_DATA_INVALID = "16011";

	/**
	 * 报名未开始
	 */
	String PUBLISHING_APPLY_NOT_START = "16012";

	/**
	 * 课程已开始，不可取消
	 */
	String PUBLISHING_SCORE_ALLREADY_START_NOT_CANCEL = "16013";

	/**
	 * 课程已结束，无法预约
	 */
	String PUBLISHING_SCORE_ALLREADY_END_NOT_APPLY = "16014";

	/**
	 * 预约次数不足
	 */
	String PUBLISHING_SCHEDULE_MISMATCH_APPLY_FAILURE = "16015";

	/**
	 * 报名已结束，无法预约
	 */
	String PUBLISHING_APPLY_ALLREADY_END_NOT_APPLY = "16016";

	/**
	 * 课程已结束，不可取消
	 */
	String PUBLISHING_SCORE_ALLREADY_END_NOT_CANCEL = "16017";

	/**
	 * 该授课时间已被其他课程占用
	 */
	String TEACHING_TIME_ALREADY_OCCUPIED = "16018";

	/**
	 * 不可预约在项目开始时间和结束时间以外的沙龙课
	 */
	String NO_APPOINTMENT_SALON_CLASS = "16020";

	/**
	 * 取消机会已用完
	 */
	String EXCEEDING_LEAVE_LIMIT = "16021";

	/**
	 * 应在几小时之前请假
	 */
	String BEFORE_FEW_HOURS_LEAVE = "16022";

	/**
	 * 系统繁忙请稍后再试
	 */
	String SYSTEM_BUSY_TRY_AGAIN_LATER = "16023";

	/**
	 * 不是沙龙课程项目
	 */
	String PROJECT_NOT_SALON = "16024";
	// ---------------发布模块结束--------------------

	// ---------------跟进模块开始--------------------

	/**
	 * 跟进模版对象不能为空
	 */
	String COACHINGTEMPLATE_OBJECT_IS_NOT_NULL = "17001";

	/**
	 * 跟进对象不能为空
	 */
	String COACHING_OBJECT_IS_NOT_NULL = "17002";

	/**
	 * 跟进项不能为空
	 */
	String COACHINGITEM_OBJECT_IS_NOT_NULL = "17003";

	/**
	 * 跟进反馈导出内容为空
	 */
	String THE_EXPORT_CONTENT_IS_EMPTY = "17004";

	/**
	 * 没有跟进项
	 */
	String COACHINGITEM_IS_EMPTY = "17005";

	// ---------------跟进模块结束--------------------

	// ---------------报表模块开始--------------------
	/**
	 * 年份不可以为空
	 */
	String YEAR_IS_NOT_NULL = "18001";

	/**
	 * 月份不可以为空
	 */
	String MONTH_IS_NOT_NULL = "18002";

	// ---------------报表模块开始--------------------
}
