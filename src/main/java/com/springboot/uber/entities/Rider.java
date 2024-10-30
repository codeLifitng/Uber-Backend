package com.springboot.uber.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double rating;
}
