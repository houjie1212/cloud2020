package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author houjie
 * @version V1.0
 * @date 2020/6/28 23:48
 */
@RestController
public class OrderController {

  public static final String PAYMENT_URL = "http://localhost:8001";

  @Resource
  private RestTemplate restTemplate;

  @PostMapping("/payment")
  public CommonResult<Integer> create(Payment payment) {
    return restTemplate.postForObject(PAYMENT_URL + "/payment", payment, CommonResult.class);
  }

  @GetMapping("/payment/{id}")
  public CommonResult<Payment> getPayment(@PathVariable Long id) {
    return restTemplate.getForObject(PAYMENT_URL + "/payment/" + id, CommonResult.class);
  }
}
