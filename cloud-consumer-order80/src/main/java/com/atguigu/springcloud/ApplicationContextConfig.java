package com.atguigu.springcloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author houjie
 * @version V1.0
 * @date 2020/6/28 23:55
 */
@Configuration
public class ApplicationContextConfig {

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
