package com.wcs.DTO.controller;

import com.wcs.DTO.dto.TrainerDto;
import com.wcs.DTO.entity.Trainer;
import com.wcs.DTO.repository.TrainerRepository;
import com.wcs.DTO.service.TrainerMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
public class TrainerController {
    public final TrainerRepository trainerRepository;

    public TrainerController(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;

    }
    @PostMapping("/trainer")
    public Trainer createTrainer(@RequestBody Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    @GetMapping("/trainer/{id}")
    public ResponseEntity<?> getTrainerMappers(@PathVariable long id) {
        TrainerDto trainer = TrainerMapper.TransformTrainerEntityInTrainerDto(trainerRepository.findById(id).get());
        return new ResponseEntity<>(trainer, HttpStatus.OK);
    }
}