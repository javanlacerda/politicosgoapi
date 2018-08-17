package com.example.politicosgo.bdinterfaces;


import com.example.politicosgo.entities.Obra;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

 
@Repository
public interface ObraRepository extends MongoRepository<Obra, String> {

	void deleteById(int id);

}