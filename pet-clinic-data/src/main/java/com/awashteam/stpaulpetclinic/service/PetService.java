package com.awashteam.stpaulpetclinic.service;

import com.awashteam.stpaulpetclinic.model.Owner;
import com.awashteam.stpaulpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
