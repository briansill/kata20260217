package com.briansill.kata20260217.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.briansill.kata20260217.model.Bourbon;
import com.briansill.kata20260217.repository.BourbonRepository;

@Service
public class BourbonServiceImpl implements BourbonService{
    
    private final BourbonRepository bourbonRepository;

    public BourbonServiceImpl (BourbonRepository bourbonRepository){
        this.bourbonRepository = bourbonRepository;
    }

    @Override
    public List<Bourbon> getAllBourbons(){
        return bourbonRepository.findAll();
    }

    @Override
    public Optional<Bourbon> getBourbonById (Long id){
        return bourbonRepository.findById(id);
    }

    @Override
    public Bourbon saveBourbon(Bourbon bourbon){
        return bourbonRepository.save(bourbon);
    }

    @Override
    public void deleteBourbonById(Long id){
        bourbonRepository.deleteById(id);
    }

    @Override
    public List<Bourbon> getBourbonByDistillery(String distillery){
        return bourbonRepository.findByDistillery(distillery);
    }

    @Override
    public List<Bourbon> getBourbonByName(String name){
        return bourbonRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public List<Bourbon> getBourbonByAge(Integer minAge){
        return bourbonRepository.findByAgeGreaterThanEqual(minAge);
    }

    @Override
    public List<Bourbon> getBourbonByStyle(String style){
        return bourbonRepository.findByStyle(style);
    }

}
