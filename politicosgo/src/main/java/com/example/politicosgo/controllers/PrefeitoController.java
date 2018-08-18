package com.example.politicosgo.controllers;

import java.util.Collection;

import com.example.politicosgo.entities.Prefeito;
import com.example.politicosgo.services.PrefeitoService;

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
@RequestMapping(path = "/prefeitos")
public class PrefeitoController {

    @Autowired
    private PrefeitoService pService;
    
    @GetMapping
    public Collection<Prefeito> getPrefeitos() {


        return pService.getPrefeitos();

    }

    @GetMapping(path="/{cpf}")
    public Long getAvaliacaoPrefeito(@PathVariable(name = "cpf") Long cpf){
        Long result = -1L;
        for(Prefeito prefeito : pService.getPrefeitos())
            if(prefeito.getCpf() == cpf)
                result = prefeito.getAvaliacao();
        return result;
    }

    @PostMapping
    public ResponseEntity<String> postPrefeito(@RequestBody Prefeito prefeito) {

        return this.pService.putPrefeito(prefeito);

    }

    @PutMapping
    public ResponseEntity<String> putPrefeito(@RequestBody Prefeito prefeito) {

        return this.pService.updatePrefeito(prefeito);

    }

    @DeleteMapping(path="/{cpf}")
    public ResponseEntity<String> deletePrefeitoById(@PathVariable(name = "cpf") Long cpf) {

        return this.pService.deletePrefeito(cpf);

    }

}