package com.example.politicosgo.controllers;

import java.util.Collection;
import java.util.Random;

import com.example.politicosgo.entities.Obra;
import com.example.politicosgo.entities.Prefeito;
import com.example.politicosgo.services.PrefeitoService;
import com.example.politicosgo.utils.DistanceCalculator;

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
    
    @PostMapping(path="/responsible")
    public Prefeito getRandomResponsible(@RequestBody Obra obra) {
    	Prefeito result = null;
    	
    	for(Prefeito prefeito : this.getPrefeitos()) {
    		if(prefeito.getCidade().equalsIgnoreCase(obra.getMunicipio())) {
    			result = prefeito;
    		}
    	}
    	
    	Random ge = new Random();
    	
    	if(ge.nextInt(10) == 9) {
    		 result = null;
    	}
   
    	return result;
    }

    @GetMapping(path="/{cpf}")
    public Prefeito getAvaliacaoPrefeito(@PathVariable(name = "cpf") Long cpf){
        Prefeito result = null;
        for(Prefeito prefeito : this.getPrefeitos()){
            if(prefeito.getCpf().equals(cpf))
                return prefeito;
        }
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