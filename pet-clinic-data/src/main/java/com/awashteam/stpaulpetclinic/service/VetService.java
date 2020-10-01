package com.awashteam.stpaulpetclinic.service;

import com.awashteam.stpaulpetclinic.model.Owner;
import com.awashteam.stpaulpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
