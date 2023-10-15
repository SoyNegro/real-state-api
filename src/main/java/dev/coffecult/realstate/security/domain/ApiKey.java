package dev.coffecult.realstate.security.domain;


import jakarta.persistence.*;

@Entity(name = "api_key")
public class ApiKey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String key;
}
