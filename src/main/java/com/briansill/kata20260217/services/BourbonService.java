package com.briansill.kata20260217.services;

import java.util.List;
import java.util.Optional;

import com.briansill.kata20260217.model.Bourbon;

public interface BourbonService {
    List<Bourbon> getAllBourbons();

    Optional<Bourbon> getBourbonById(Long id);

    Bourbon saveBourbon(Bourbon bourbon);

    void deleteBourbonById(Long id);

    List<Bourbon> getBourbonByDistillery(String distillery);

    List<Bourbon> getBourbonByAge(Integer minAge);

    List<Bourbon> getBourbonByName(String name);

    List<Bourbon> getBourbonByStyle(String styel);

}
