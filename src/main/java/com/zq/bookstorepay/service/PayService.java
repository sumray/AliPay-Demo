package com.zq.bookstorepay.service;

import com.alipay.api.AlipayApiException;
import com.zq.bookstorepay.pojo.AlipayBean;

public interface PayService {
	String aliPay(AlipayBean alipayBean) throws AlipayApiException;
}
