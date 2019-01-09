package com.imooc.order.utils;

import com.imooc.order.VO.ResultVO;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 23:30 2019/1/8
 * @ Description：
 */
public class ResultVOUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
