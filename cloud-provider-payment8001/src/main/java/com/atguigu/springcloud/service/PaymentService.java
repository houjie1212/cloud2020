package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Payment;

/**
 * @author houjie
 * @version V1.0
 * @date 2020/6/28 23:06
 */
public interface PaymentService {

  int create(Payment payment);

  Payment getPaymentById(Long id);
}
