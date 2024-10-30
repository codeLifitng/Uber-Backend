package com.springboot.uber.entities;

import com.springboot.uber.utils.enums.Role;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "app_user")
@Data
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(unique = true)
    private  String email;
    private String password;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;


}
