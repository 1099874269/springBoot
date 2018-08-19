package org.spring.springboot.controller;

import org.spring.springboot.domain.OrderInfo;
import org.spring.springboot.service.TransationService;
import org.spring.springboot.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "springBoot")
public class TransactionController
{
    @Autowired
    TransationService service;
    /**
     * 跳转到主页
     * @param cityName
     * @return
     */
    @RequestMapping(value = "/transation/index", method = RequestMethod.GET)
    public String transationIndex(@RequestParam(value = "cityName", required = false) String cityName)
    {
      return "transation/Transactionindex";
    }

    /**
     * 提交订单
     * @param orderInfo
     * @return
     */
    @RequestMapping(value = "/transation/submitOrder")
    @ResponseBody
    public Message submitOrder(OrderInfo orderInfo)
    {
        Message msg = new Message();
        int i=service.insertOrder(orderInfo);
        if(i>0){
            msg.setMsgCode("Y");
            msg.setMsgDesc("提交成功！");
        }else {
            msg.setMsgCode("N");
            msg.setMsgDesc("提交成功！");
        }
        return msg;
    }

}
