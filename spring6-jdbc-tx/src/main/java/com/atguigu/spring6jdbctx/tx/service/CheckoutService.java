package com.atguigu.spring6jdbctx.tx.service;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/29
 * @description
 */
public interface CheckoutService {

    void checkout(Integer[] bookIds, Integer userId);
}
