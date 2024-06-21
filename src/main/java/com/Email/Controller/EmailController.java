package com.Email.Controller;
//import com.Email.Config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.Email.Model.Email;



@RestController
@RequestMapping("/email")
public class EmailController {

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
//    @PostMapping("/send-email")
    public void sendEmailChat(String receiverName) {
        System.out.println("Consumed message, " + "email needs to be sent to: " + receiverName);
        System.out.println("Simulating sending email to: " + receiverName);
//        System.out.println("Simulating sending email to: " + receiverName);
//        return ResponseEntity.ok("Notification sent successfully.");
    }

    @RabbitListener(queues = {"${rabbitmq.queue2.name}"})
    public void sendEmailSignUp(String signUpName) {
        System.out.println("Consumed message, " + "email needs to be sent to: " + signUpName);
        System.out.println("Simulating sending email to: " + signUpName);
//        System.out.println("Simulating sending email to: " + receiverName);
//        return ResponseEntity.ok("Notification sent successfully.");
    }
}
