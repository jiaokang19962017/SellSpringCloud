package com.imooc.product.dto;

import lombok.Data;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 22:13 2019/1/9
 * @ Description：
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public CartDTO() {
    }
}
