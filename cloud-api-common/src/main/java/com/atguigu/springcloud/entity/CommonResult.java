package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author houjie
 * @version V1.0
 * @date 2020/6/28 22:45
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
  private Integer code;
  private String message;
  private T data;

  public CommonResult(Integer code, String message) {
    this(code, message, null);
  }
}
