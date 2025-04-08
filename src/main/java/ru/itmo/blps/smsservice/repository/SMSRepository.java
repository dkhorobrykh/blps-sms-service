package ru.itmo.blps.smsservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.itmo.blps.smsservice.domain.SMS;

public interface SMSRepository extends JpaRepository<SMS, Long> {
    List<SMS> findAllByPhoneNumber(String phoneNumber);
}