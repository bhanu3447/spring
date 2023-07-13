package org.bhanu.orderservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("org.bhanu.orderservice")
public class App
{
  @Bean
  public RestTemplate getRestTemplate()
  {
	  return new RestTemplate();
  }
}
