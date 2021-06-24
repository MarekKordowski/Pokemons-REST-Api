package com.example.pokemons.pokemon;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PokemonService {
    private PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public Pokemon save(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public List<Pokemon> getAll() {
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> findById(int id) {
        return pokemonRepository.findById(id);
    }

    public void deleteById(int id) {
        pokemonRepository.deleteById(id);
    }

    public Pokemon updatePokemon(Integer id, Pokemon pokemonDetails) {
        Pokemon pokemon = findById(id)
                .orElseThrow(() -> new RuntimeException("Pokemon with id " + id + " doesn't exist"));
        pokemon.setId(pokemonDetails.getId());
        pokemon.setName(pokemonDetails.getName());
        pokemon.setType(pokemonDetails.getType());
        pokemonRepository.save(pokemon);
        return pokemon;
    }

    public Optional<Pokemon> findByName(String name) {
        return pokemonRepository.findByName(name);
    }

    public List<Pokemon> findByType(String type) {
        return pokemonRepository.findByType(type);
    }
}
