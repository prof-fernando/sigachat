package br.edu.iffarroupilha.sigachat.configuration;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MessageController {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat")
    public void chat(@Payload Message message) {
        log.info("Message received: {}", message);
        simpMessagingTemplate.convertAndSendToUser(message.username(), "/topic", message);
    }
    @Builder
    public record Message(String username, String message) { }
}