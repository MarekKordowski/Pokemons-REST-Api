package com.example.pokemons.pokemon;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pokemons")
public class PokemonController {
    private PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @ApiOperation(value = "Adding Pokemon to database", notes = "Enter Pokemon name and type")
    @PostMapping
    public Pokemon save(@RequestBody Pokemon newPokemon) {
        return pokemonService.save(newPokemon);

    }

    @ApiOperation(value = "Retrieving all Pokemons from database", notes = "You get a list of all Pokemons stored in database")
    @GetMapping
    public List<Pokemon> getAll() {
        return pokemonService.getAll();
    }

    @ApiOperation(value = "Retrieving Pokemon from data base by id", notes = "Enter id to get specific Pokemon")
    @GetMapping("/{id}")
    public Pokemon getById(@PathVariable int id) {
        return pokemonService.findById(id)
                .orElseThrow(() -> new RuntimeException("Pokemon with id " + id + " doesn't exist"));
    }

    @ApiOperation(value = "Removing Pokemon from database by id", notes = "Enter id to remove specific Pokemon")
    @DeleteMapping("/{id}")
    public void deletePokemonById(@PathVariable Integer id) {
        pokemonService.deleteById(id);
    }

    @ApiOperation(value = "Updating Pokemon name and type", notes = "Enter id to update Pokemon atributes")
    @PutMapping("/{pokemonId}")
    public Pokemon updatePokemon(@RequestBody Pokemon pokemon, @PathVariable Integer pokemonId) {
        return pokemonService.updatePokemon(pokemonId, pokemon);
    }

    @ApiOperation(value = "Retrieving Pokemon from database by name", notes = "Enter Pokemon name to get It from database ")
    @GetMapping("/names/{name}")
    public Pokemon findByName(@PathVariable String name) {
        return pokemonService.findByName(name)
                .orElseThrow(() -> new RuntimeException("Pokemon with name " + name + " doesn't exist"));
    }

    @ApiOperation(value = "Retrieving Pokemon from database by type", notes = "Enter Pokemon type to get all Pokemons of a given type ")
    @GetMapping("/types/{type}")
    public List<Pokemon> findByType(@PathVariable String type) {
        return pokemonService.findByType(type);
    }
}
