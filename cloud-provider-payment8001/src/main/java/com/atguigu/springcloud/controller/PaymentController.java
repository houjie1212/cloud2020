package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author houjie
 * @version V1.0
 * @date 2020/6/28 23:09
 */
@RestController
@Slf4j
public class PaymentController {

  @Resource
  private PaymentService paymentService;

  @PostMapping(value = "/payment")
  public CommonResult<Integer> create(@RequestBody Payment payment) {
    int result = paymentService.create(payment);
    log.info("*****插入结果：{}", result);
    if (result > 0) {
      return new CommonResult<>(200, "insert success", result);
    } else {
      return new CommonResult<>(444, "insert fail", null);
    }
  }

  @GetMapping(value = "/payment/{id}")
  public CommonResult<Payment> getPayment(@PathVariable Long id) {
    Payment payment = paymentService.getPaymentById(id);
    log.info("*****查询结果：{}", payment);
    if (payment != null) {
      return new CommonResult<>(200, "query success", payment);
    } else {
      return new CommonResult<>(444, String.format("query[%d] result is null", id), null);
    }
  }
}
