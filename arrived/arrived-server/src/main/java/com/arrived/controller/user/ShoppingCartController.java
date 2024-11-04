package com.arrived.controller.user;


import com.arrived.dto.ShoppingCartDTO;
import com.arrived.entity.ShoppingCart;
import com.arrived.result.Result;
import com.arrived.service.ShoppingCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/shoppingCart")
@Slf4j
@Api(tags = "C端-购物车相关接口")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    /**
     * 添加购物车
     *
     * @param shoppingCartDTO
     */
    @PostMapping("/add")
    @ApiOperation("添加购物车中一个商品")
    public Result add(@RequestBody ShoppingCartDTO shoppingCartDTO) {
        //log.info("添加购物车中一个商品，商品：{}", shoppingCartDTO);
        shoppingCartService.addShoppingCart(shoppingCartDTO);
        return Result.success();
    }

    /**
     * 删除购物车中一个商品
     *
     * @param shoppingCartDTO
     * @return
     */
    @PostMapping("/sub")
    @ApiOperation("删除购物车中一个商品")
    public Result sub(@RequestBody ShoppingCartDTO shoppingCartDTO) {
        //log.info("删除购物车中一个商品，商品：{}", shoppingCartDTO);
        shoppingCartService.subShoppingCart(shoppingCartDTO);
        return Result.success();
    }

    /**
     * 查询购物车商品
     */
    @GetMapping("/list")
    @ApiOperation("查询购物车商品")
    public Result<List<ShoppingCart>> list() {
        //log.info("查询购物车商品");
        List<ShoppingCart> list = shoppingCartService.showShoppingCart();
        return Result.success(list);
    }

    /**
     * 清空购物车
     */
    @DeleteMapping("/clean")
    @ApiOperation("情况购物车商品")
    public Result clean() {
        //log.info("清空购物车");
        shoppingCartService.cleanShopCart();
        return Result.success();
    }

}
