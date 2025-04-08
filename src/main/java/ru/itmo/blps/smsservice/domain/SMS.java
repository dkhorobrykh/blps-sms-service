package ru.itmo.blps.smsservice.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
        name = "blps_sms",
        schema = "s367595"
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SMS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "text")
    private String text;

    @Column(name = "created_at")
    private Instant createdAt;
}
