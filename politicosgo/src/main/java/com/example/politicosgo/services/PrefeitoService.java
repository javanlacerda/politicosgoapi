package com.example.politicosgo.services;


import java.util.List;

import com.example.politicosgo.bdinterfaces.PrefeitoRepository;
import com.example.politicosgo.entities.Prefeito;
import com.example.politicosgo.utils.CSVController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PrefeitoService {

    @Autowired
    private PrefeitoRepository pRepository;

    public CSVController csv = new CSVController();

    public List<Prefeito> getPrefeitos() {

    
        return this.pRepository.findAll();

    }

    public ResponseEntity<String> putPrefeito(Prefeito prefeito) {

        try {
            this.pRepository.save(prefeito);
            return new ResponseEntity<>("Prefeito cadastrada!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    public ResponseEntity<String> updatePrefeito(Prefeito prefeito) {

        try {
            this.pRepository.save(prefeito);
            return new ResponseEntity<>("Prefeito atualizada!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }

    public ResponseEntity<String> deletePrefeito(Long cpf) {

        try {
            this.pRepository.deleteByCpf(cpf);
            return new ResponseEntity<>("Prefeito deletada!", HttpStatus.OK);

        } catch (Exception e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }

    }

    public void deleteAll() {

        this.pRepository.deleteAll();
    }

    // public void importPrefeitos() {

    //     deleteAll();

    //     ArrayList<String[]> prefeitos = csv.run("prefeitos.csv");
    //     for (String[] prefeito : prefeitos) {

    //         String nome = prefeito[0];
    //         Long cpf = myParseLong(prefeito[1]);
    //         String img = prefeito[2];
    //         String sexo = prefeito[3];
    //         String partido = prefeito[4];
    //         String cidade = prefeito[5];

    //         Prefeito prefeitoObj = new Prefeito(cpf, nome, img, sexo, partido, cidade);

    //         putPrefeito(prefeitoObj);

    //     }
    // }

    // public Double myParseDouble(String str) {
    // return str.trim().equals("") ? null : Double.parseDouble(str);
    // }

    // public Long myParseLong(String str) {
    // return str.trim().equals("") ? null : Long.parseLong(str);
    // }

}
