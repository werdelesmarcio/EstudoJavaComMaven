package com.dev.userdep.entities;

import jakarta.persistence.*;

@Entity
@Table(name="tb_department")
public class Department {
    //Variáveis para departamento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    //Constructor vazio
    public Department(){

    }

    //Métodos de acesso
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
