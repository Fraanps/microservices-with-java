package br.com.fps.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

  // componente de instância única - singleton - para ter a
  // temos a disposição pra injetar em outros serviços

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
