package com.imooc.product.common;

import lombok.Data;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 11:00 2019/1/12
 * @ Description：
 */
@Data
public class DecreaseStockInput {
    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
