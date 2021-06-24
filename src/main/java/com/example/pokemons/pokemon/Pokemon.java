package com.example.pokemons.pokemon;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@RequiredArgsConstructor
public class Pokemon {
    @ApiModelProperty(notes="pokemon id", name="id", required = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ApiModelProperty(notes="pokemon name", name="name", required = true)
    @Column(unique = true)
    private String name;
    @ApiModelProperty(notes="pokemon type", name="type", required = true)
    private String type;

}

