package com.senai.pet.Service;


import com.senai.pet.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    private PetRepository petRepository;


    public PetRepository getPetRepository() {
        return petRepository = petRepository;
    }


}
