package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author houjie
 * @version V1.0
 * @date 2020/6/28 22:49
 */
@Mapper
public interface PaymentDao {

  int create(Payment payment);

  Payment getPaymentById(@Param("id") Long id);
}
