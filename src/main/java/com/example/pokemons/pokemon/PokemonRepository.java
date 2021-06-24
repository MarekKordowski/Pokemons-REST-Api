package com.example.pokemons.pokemon;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
    Optional<Pokemon> findByName(String name);

    List<Pokemon> findByType(String type);
}
