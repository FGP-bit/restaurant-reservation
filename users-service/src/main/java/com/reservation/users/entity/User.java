package com.reservation.users.entity;

import jakarta.persistence.*;
import lombol.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgesConstructor
@AllArgsConstructor
@AllArgsConstructor
@Builder
public class User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nulleable = false)
    private String email;

    @Column(nulleable = false)
    private String fullName
}