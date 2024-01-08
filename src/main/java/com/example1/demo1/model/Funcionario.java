package com.example1.demo1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Funcionario {
    @Id
    public int codFunc;

    @Column
    public String nome;

    @Column
    public int senha;

}
