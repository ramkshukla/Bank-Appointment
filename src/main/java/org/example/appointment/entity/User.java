//package org.example.appointment.entity;
//
//
//import jakarta.persistence.*;
//import org.springframework.security.core.userdetails.UserDetails;
//
//@Entity
//public class User implements UserDetails{
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "userId",nullable = false, updatable = false )
//    private Long userId;
//    private String username;
//    private String password;
//    private String firstName;
//    private String lastName;
//
//    @Column(name = "email", unique = true, nullable = false)
//    private String email;
//    private String phone;
//
//    private boolean enabled = true;
//
//
//}
