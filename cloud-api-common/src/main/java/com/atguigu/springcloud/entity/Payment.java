package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author houjie
 * @version V1.0
 * @date 2020/6/28 22:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {
  private Long id;
  private String serial;
}
