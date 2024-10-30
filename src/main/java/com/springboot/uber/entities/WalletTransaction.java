package com.springboot.uber.entities;

import com.springboot.uber.utils.enums.TransactionMethod;
import com.springboot.uber.utils.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Data
public class WalletTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    @Enumerated(EnumType.STRING)
    private TransactionMethod transactionMethod;

    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;

    private String transactionId;

    @CreationTimestamp
    private LocalDateTime timeStamp;

    @ManyToOne
    private Wallet wallet;
}
