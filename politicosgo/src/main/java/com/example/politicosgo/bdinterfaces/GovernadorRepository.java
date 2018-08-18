package com.example.politicosgo.bdinterfaces;


import com.example.politicosgo.entities.Governador;
import com.example.politicosgo.entities.Obra;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface GovernadorRepository extends MongoRepository<Governador, String> {

	void deleteByCpf(Long cpf);

}