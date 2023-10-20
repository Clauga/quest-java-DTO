package com.wcs.DTO.repository;

import com.wcs.DTO.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
