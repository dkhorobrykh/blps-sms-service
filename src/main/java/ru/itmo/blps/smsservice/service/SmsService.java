package ru.itmo.blps.smsservice.service;

import java.time.Instant;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.itmo.blps.smsservice.domain.SMS;
import ru.itmo.blps.smsservice.repository.SMSRepository;

@Service
@RequiredArgsConstructor
@Slf4j
public class SmsService {
    private final SMSRepository smsRepository;

    public List<SMS> getAllSmsByNumber(String phoneNumber) {
        return smsRepository.findAllByPhoneNumber(phoneNumber);
    }

    public SMS sendSms(String phoneNumber, String text) {
        SMS sms = new SMS();
        sms.setPhoneNumber(phoneNumber);
        sms.setText(text);
        sms.setCreatedAt(Instant.now());
        return smsRepository.save(sms);
    }
}
