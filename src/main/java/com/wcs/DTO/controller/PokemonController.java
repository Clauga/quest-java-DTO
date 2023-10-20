package com.wcs.DTO.controller;

import com.wcs.DTO.dto.PokemonDto;
import com.wcs.DTO.entity.Pokemon;
import com.wcs.DTO.service.PokemonMapper;
import com.wcs.DTO.repository.PokemonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class PokemonController {
    public final PokemonRepository pokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @PostMapping("/pokemons")
    public Pokemon createPokemon(@RequestBody Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @GetMapping("/pokemons/{id}")
    public ResponseEntity<?> getPokemonMappers(@PathVariable long id) {
        PokemonDto pokemonDto = PokemonMapper.TransformPokemonEntityInPokemonDto(pokemonRepository.findById(id).get());
        return new ResponseEntity<>(pokemonDto, HttpStatus.OK);
    }
}
