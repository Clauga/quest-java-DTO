package com.wcs.DTO.service;

import com.wcs.DTO.dto.PokemonDto;
import com.wcs.DTO.entity.Pokemon;
import org.springframework.stereotype.Service;


@Service
public class PokemonMapper {
    public static PokemonDto TransformPokemonEntityInPokemonDto(Pokemon pokemon) {
        PokemonDto pokemonDTO = new PokemonDto();
        pokemonDTO.setName(pokemon.getName());
        pokemonDTO.setAttribute(pokemon.getAttribute());
        return pokemonDTO;
    }

    public Pokemon TransformPokemonDtoInPokemonEntity(PokemonDto pokemonDTO) {
        Pokemon pokemon = new Pokemon();
        pokemon.setName(pokemonDTO.getName());
        pokemon.setAttribute(pokemonDTO.getAttribute());
        return pokemon;
    }
}

