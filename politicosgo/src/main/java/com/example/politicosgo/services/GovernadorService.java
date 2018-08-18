package com.example.politicosgo.services;


import java.util.List;

import com.example.politicosgo.bdinterfaces.GovernadorRepository;
import com.example.politicosgo.entities.Governador;
import com.example.politicosgo.utils.CSVController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GovernadorService {

    @Autowired
    private GovernadorRepository gRepository;

    public CSVController csv = new CSVController();

    public List<Governador> getGovernadores() {

        return this.gRepository.findAll();

    }

    public ResponseEntity<String> putGovernador(Governador governador) {

        try {
            this.gRepository.save(governador);
            return new ResponseEntity<>("Governador cadastrado!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    public ResponseEntity<String> updateGovernador(Governador governador) {

        try {
            this.gRepository.save(governador);
            return new ResponseEntity<>("Governador atualizado!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    public ResponseEntity<String> deleteGovernador(Long cpf) {

        try {
            this.gRepository.deleteByCpf(cpf);
            return new ResponseEntity<>("Governador deletado!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }

    }

    public void deleteAll() {

        this.gRepository.deleteAll();
    }

   
}
