package ru.itmo.blps.smsservice.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itmo.blps.smsservice.domain.SMS;
import ru.itmo.blps.smsservice.service.SmsService;

@RestController
@RequiredArgsConstructor
@RequestMapping("sms")
public class SmsController {

    private final SmsService smsService;

    @GetMapping
    public ResponseEntity<List<SMS>> getAllSmsByNumber(@RequestParam String phoneNumber) {
        return ResponseEntity.ok(smsService.getAllSmsByNumber(phoneNumber));
    }

    @PostMapping
    public ResponseEntity<SMS> sendSms(
            @RequestParam String phoneNumber,
            @RequestParam String text
    ) {
        return ResponseEntity.ok(smsService.sendSms(phoneNumber, text));
    }
}
