package com.recanto.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Hospede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String telefone;

    @OneToMany(mappedBy = "hospede")
    private List<Reserva> reserva;
}
