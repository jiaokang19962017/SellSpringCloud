package com.imooc.order.utils;

import java.util.Random;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:54 2019/1/8
 * @ Description：
 */
public class KeyUtil {
    // 生成唯一主键(时间戳+随机数)

    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() +String.valueOf(number);
    }
}
