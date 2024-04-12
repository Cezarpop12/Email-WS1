package com.Email.Controller;
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

    @PostMapping("/send-email")
    public ResponseEntity<String> sendEmail(@RequestBody String receiverName) {
        System.out.println("Simulating sending email to: " + receiverName);
        return ResponseEntity.ok("Notification sent successfully.");
    }
}
