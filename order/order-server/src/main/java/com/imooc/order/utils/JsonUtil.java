package com.imooc.order.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:47 2019/1/14
 * @ Description：
 */
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * 转换为json字符串
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Object fromJson(String string,Class classtype){
        try {
            return objectMapper.readValue(string,classtype);
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
