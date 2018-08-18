package com.example.politicosgo.bdinterfaces;

import com.example.politicosgo.entities.Prefeito;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface PrefeitoRepository extends MongoRepository<Prefeito, String> {

	void deleteByCpf(Long cpf);

}