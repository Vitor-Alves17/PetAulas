package com.senai.pet.entity;

import com.senai.pet.enums.Porte;
import com.senai.pet.enums.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "tb_pet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pet {

    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private int idade;
    private Porte porte;
    private Tipo tipo;
    private String raca;

}
