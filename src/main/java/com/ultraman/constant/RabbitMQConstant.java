package com.ultraman.constant;

public interface RabbitMQConstant {

	/**
	 * 死信队列 交换机标识符
	 */
	String X_DEAD_LETTER_EXCHANGE = "x-dead-letter-exchange";

	/**
	 * 死信队列 交换机绑定键标识符
	 */
	String X_DEAD_LETTER_ROUTING_KEY = "x-dead-letter-routing-key";

	/**
	*  死信交换机名
	*/
	public static final String DAILY_DEAD_EXCHAGE = "daily_dead_exchage";

	/**
	 * 死信队列名
	 */
	public static final String DAILY_DEAD_QUEUE = "daily_dead_queue";

	/**
	 * 死信路由键名
	 */
	public static final String DAILY_ROUTE_KEY = "daily_dead";

	/**
	 *  普通交换机名
	 */
	public static final String DAILY_EXCHAGE = "daily_exchange";

	/**
	 *交换机类型
	 */
	public static final String DIRECT = "direct";

}
