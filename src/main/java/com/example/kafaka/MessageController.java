package com.example.kafaka;

import org.springframework.kafka.core.KafkaAdmin;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

  private KafkaTemplate kafkaTemplate;


  public MessageController(KafkaTemplate kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  @PostMapping
  public void publish(@RequestBody MessageRequest request) {
    kafkaTemplate.send("deneb1593", request.getMessage());
  }

}
