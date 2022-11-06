package com.example.kafaka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfigure {

  @Bean
  public NewTopic appTopic() {
    return TopicBuilder
      .name("deneb1593")
      .build();
  }

}
