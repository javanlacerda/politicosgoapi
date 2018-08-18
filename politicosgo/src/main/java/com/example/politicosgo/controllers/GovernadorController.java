package com.example.politicosgo.controllers;

import java.util.Collection;

import com.example.politicosgo.entities.Governador;
import com.example.politicosgo.services.GovernadorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/governadores")
public class GovernadorController {

    @Autowired
    private GovernadorService gService;
    
    @GetMapping
    public Collection<Governador> getGovernadores() {


        return gService.getGovernadores();

    }

    @PostMapping
    public ResponseEntity<String> postGovernador(@RequestBody Governador governador) {

        return this.gService.putGovernador(governador);

    }

    @PutMapping
    public ResponseEntity<String> putGovernador(@RequestBody Governador governador) {

        return this.gService.updateGovernador(governador);

    }

    @DeleteMapping(path="/{cpf}")
    public ResponseEntity<String> deleteGovernadorById(@PathVariable(name = "cpf") Long cpf) {

        return this.gService.deleteGovernador(cpf);

    }

}