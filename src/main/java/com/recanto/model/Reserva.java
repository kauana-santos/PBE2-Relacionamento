package com.recanto.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dtCheckIn;

    @Column(nullable = false)
    private LocalDateTime dtCheckOut;

    @Column(nullable = false)
    private Status status;

    @JoinColumn(name = "id_quarto")
    @ManyToOne
    private Quarto quarto;

    @JoinColumn(name = "id_hospede")
    @ManyToOne
    private Hospede hospede;
}
