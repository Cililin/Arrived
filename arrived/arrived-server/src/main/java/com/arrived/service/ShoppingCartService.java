package com.arrived.service;

import com.arrived.dto.ShoppingCartDTO;
import com.arrived.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    /**
     * 删除购物车中一个商品
     *
     * @param shoppingCartDTO
     */
    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 添加购物车
     *
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 获取购物车列表
     *
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清空购物车
     */
    void cleanShopCart();
}
