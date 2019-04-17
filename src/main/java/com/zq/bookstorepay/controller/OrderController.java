package com.zq.bookstorepay.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.api.AlipayApiException;
import com.zq.bookstorepay.pojo.AlipayBean;
import com.zq.bookstorepay.service.PayService;

@RestController
public class OrderController {
	@Autowired
	private PayService payService;
	
	@PostMapping("/pay")
	public String pay(String outTradeNo, String subject, String totalAmount, String body) throws AlipayApiException {
        AlipayBean alipayBean = new AlipayBean();
        alipayBean.setOut_trade_no(outTradeNo);
        alipayBean.setSubject(subject);
        alipayBean.setTotal_amount(totalAmount);
        alipayBean.setBody(body);
        return payService.aliPay(alipayBean);
	}
}
