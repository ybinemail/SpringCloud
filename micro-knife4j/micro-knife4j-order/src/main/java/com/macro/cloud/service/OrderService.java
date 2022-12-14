package com.macro.cloud.service;

import com.macro.cloud.domain.Order;

import java.util.List;

/**
 * Created by Robin on 2020/1/29.
 */
public interface OrderService {
    void create(Order order);

    Order getOrder(Long id);

    void update(Order order);

    void delete(Long id);
}
