package com.recanto.model;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeDaCategoria;

    @Column(nullable = false)
    private BigDecimal precoDiaria;

    @Column(nullable = false)
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Quarto> quarto;
}
