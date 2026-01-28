package com.senai.pet.Service;


import com.senai.pet.DTO.PetDTO;
import com.senai.pet.entity.Pet;
import com.senai.pet.repository.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    private PetRepository petRepository;


    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public String save(PetDTO petDTO) {
        Pet pet = new Pet(petDTO.getNome(), petDTO.getIdade(), petDTO.getPorte(), petDTO.getTipo(), petDTO.getRaca());
        petRepository.save(pet);

        return "Salvo com sucesso";
    }

}
