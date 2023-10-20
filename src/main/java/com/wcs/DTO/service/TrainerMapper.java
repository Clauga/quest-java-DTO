package com.wcs.DTO.service;

import com.wcs.DTO.dto.TrainerDto;
import com.wcs.DTO.entity.Trainer;
import org.springframework.stereotype.Service;


@Service
public class TrainerMapper {

    public static TrainerDto TransformTrainerEntityInTrainerDto(Trainer trainer) {
        TrainerDto trainerDTO = new TrainerDto();
        trainerDTO.setName(trainer.getName());
        trainerDTO.setPokemons(trainer.getPokemons());
        return trainerDTO;
    }

    public Trainer TransformTrainerStoInTrainerEntity(TrainerDto trainerDTO) {
        Trainer trainer = new Trainer();
        trainer.setName(trainerDTO.getName());
        trainer.setPokemons(trainerDTO.getPokemons());
        return trainer;
    }
}
