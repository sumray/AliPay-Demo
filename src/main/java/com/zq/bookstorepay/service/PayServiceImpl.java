package com.zq.bookstorepay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alipay.api.AlipayApiException;
import com.zq.bookstorepay.pojo.AlipayBean;

@Service
public class PayServiceImpl implements PayService {
	@Autowired
    private Alipay alipay;
    
    @Override
    public String aliPay(AlipayBean alipayBean) throws AlipayApiException {
        return alipay.pay(alipayBean);
    }

}
