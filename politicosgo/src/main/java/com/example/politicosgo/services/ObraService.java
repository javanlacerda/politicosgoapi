package com.example.politicosgo.services;

import java.util.Collection;

import com.example.politicosgo.bdinterfaces.ObraRepository;
import com.example.politicosgo.entities.Obra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ObraService {

    @Autowired
    private ObraRepository oRepository;

    public Collection<Obra> getObras() {

        return this.oRepository.findAll();

    }

    public ResponseEntity<String> putObra(Obra obra) {

        try {
            this.oRepository.save(obra);
            return new ResponseEntity<>("Obra cadastrada!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    public ResponseEntity<String> updateObra(Obra obra) {

        try {
            this.oRepository.save(obra);
            return new ResponseEntity<>("Obra atualizada!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    public ResponseEntity<String> deleteObra(int id) {

        try {
            this.oRepository.deleteById(id);
            return new ResponseEntity<>("Obra deletada!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
        
    }

}