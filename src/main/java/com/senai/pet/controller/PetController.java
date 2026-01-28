package com.senai.pet.controller;

import com.senai.pet.DTO.PetDTO;
import com.senai.pet.Service.PetService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pet")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @PostMapping
    public ResponseEntity<?> savePet(@RequestBody @Valid PetDTO petDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(petService.save(petDTO));
    }
}
