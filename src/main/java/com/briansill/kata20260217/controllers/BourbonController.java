package com.briansill.kata20260217.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.briansill.kata20260217.model.Bourbon;
import com.briansill.kata20260217.services.BourbonService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/bourbon")
public class BourbonController {

    private final BourbonService bourbonService;

    @GetMapping
    public List<Bourbon> getallBourbons(){
        return bourbonService.getAllBourbons();
    }

    @GetMapping("/{id}")
    public Optional<Bourbon> getBourbonById(@PathVariable Long id){
        return bourbonService.getBourbonById(id);
    }

    @PostMapping
    public Bourbon saveBourbon(@RequestBody Bourbon bourbon){
        return bourbonService.saveBourbon(bourbon);
    }

    @PutMapping("/{id}")
    public Bourbon updateBourbon(@PathVariable Long id, @RequestBody Bourbon bourbon){
        return bourbonService.saveBourbon(bourbon);
    }

    @DeleteMapping("/{id}")
    public void deleteBourbon(@PathVariable Long id){
        bourbonService.deleteBourbonById(id);
    }

    @GetMapping("/search/distillery")
    public List<Bourbon> searchByDistillery(@RequestParam String distillery){
        return bourbonService.getBourbonByDistillery(distillery);
    }

    @GetMapping("/search/age")
    public List<Bourbon> searchByAge(@RequestParam Integer minAge){
        return bourbonService.getBourbonByAge(minAge);
    }

    @GetMapping("/search/style")
    public List<Bourbon> searchByStyle(@RequestParam String style){
        return bourbonService.getBourbonByStyle(style);
    }

    @GetMapping("/search/name")
    public List<Bourbon> searchByName(@RequestParam String name){
        return bourbonService.getBourbonByName(name);
    }
    
}
