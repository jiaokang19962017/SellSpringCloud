package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:46 2019/1/7
 * @ Description：
 */
public class ResultVOUtil {

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setDate(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
