package com.example.politicosgo.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


import com.example.politicosgo.entities.Obra;
import com.example.politicosgo.services.ObraService;
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
@RequestMapping(path = "/obras")
public class ObraController {
	
	private final int MAX_ALLOWED_DISTANCE = 3000;

    @Autowired
    private ObraService oService;
    
    @GetMapping
    public Collection<Obra> getObras() {


        return oService.getObras();

    }
  


    @PostMapping("/closeto")
    public Collection<Obra> getObrasClose(@RequestBody Map<String, Double> json){
        Collection<Obra> col = new ArrayList<Obra>();
        Double latitude = json.get("latitude");
        Double longitude = json.get("longitude");
        DistanceCalculator dc = new DistanceCalculator();
        for(Obra obra : this.getObras()) {
        	Double distance = dc.getDistance(obra.getLatitude(), obra.getLongitude(), latitude, longitude);
        	if(distance <= MAX_ALLOWED_DISTANCE) {
        		col.add(obra);
        	}
        }
        return col;
    }

    @PostMapping
    public ResponseEntity<String> postObra(@RequestBody Obra obra) {

        return this.oService.putObra(obra);

    }

    @PutMapping
    public ResponseEntity<String> putObra(@RequestBody Obra obra) {

        return this.oService.updateObra(obra);

    }

    @DeleteMapping(path= "/{id}")
    public ResponseEntity<String> deleteObraById(@PathVariable(name = "id") Long id) {

        return this.oService.deleteObra(id);

    }

}