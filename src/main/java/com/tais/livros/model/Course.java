package com.tais.livros.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Course {


    @Id //Chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)//Gera o id automaticamente
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 200, nullable = false)
    private String category;
}
