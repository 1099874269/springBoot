package org.spring.springboot.dao;

import org.spring.springboot.domain.OrderInfo;

public interface TransationDao {
    /**
     * 插入订单信息
     * @param orderInfo
     * @return
     */
    public int insertOrder(OrderInfo orderInfo);
}
