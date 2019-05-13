package com.ultraman.util;

import com.ultraman.i18n.MessageSourceHolder;

/**
 * 根据code码取message
 * 
 * @author 42517
 * @date 2018年12月8日
 */
public class MessageUtils {

    private static final MessageSourceHolder messageSourceHolder =
        (MessageSourceHolder)SpringBeanUtil.getBean("messageSourceHolder");

    private MessageUtils() {

    }

    /**
     * 
     * @param code
     * @return
     */
    public static String getMessage(final String code) {

        return messageSourceHolder.getMessage(code);
    }

}
