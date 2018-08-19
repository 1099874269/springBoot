package org.spring.springboot.service;

import org.spring.springboot.domain.OrderInfo;

public interface TransationService {
    /**
     * 插入订单信息
     * @param orderInfo
     * @return
     */
    public int insertOrder(OrderInfo orderInfo);
}
