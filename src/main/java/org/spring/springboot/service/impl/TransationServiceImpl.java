package org.spring.springboot.service.impl;

import org.spring.springboot.dao.TransationDao;
import org.spring.springboot.domain.OrderInfo;
import org.spring.springboot.service.TransationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransationServiceImpl implements TransationService {
    @Autowired
    TransationDao dao;
    @Override
    public int insertOrder(OrderInfo orderInfo) {
        return dao.insertOrder(orderInfo);
    }
}
