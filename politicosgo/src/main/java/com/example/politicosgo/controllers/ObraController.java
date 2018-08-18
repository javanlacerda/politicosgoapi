package com.example.politicosgo.controllers;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


import com.example.politicosgo.entities.Obra;
import com.example.politicosgo.services.ObraService;

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

    @Autowired
    private ObraService oService;
    
    @GetMapping
    public Collection<Obra> getObras() {


        return oService.getObras();

    }
    
    /**
    function getDistanceFromLatLonInKm(lat1,lon1,lat2,lon2) {
  var R = 6371; // Radius of the earth in km
  var dLat = deg2rad(lat2-lat1);  // deg2rad below
  var dLon = deg2rad(lon2-lon1); 
  var a = 
    Math.sin(dLat/2) * Math.sin(dLat/2) +
    Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * 
    Math.sin(dLon/2) * Math.sin(dLon/2)
    ; 
  var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)); 
  var d = R * c; // Distance in km
  return d;
}
     */

    private Double degToRad(Double deg) {
    	return deg * (Math.PI / 180.0);
    }

    private Double getDistance(Double lat1, Double lon1, Double lat2, Double lon2){
        Double r = 6371.0;
        Double dLat = degToRad(lat2 - lat1);
        Double dLon = degToRad(lon2 - lon1);
        Double a = Math.sin(dLat/2) * Math.sin(dLat/2) + 
        		   Math.cos(degToRad(lat1)) * Math.cos(degToRad(lat2)) * 
        		   Math.sin(dLon/2) * Math.sin(dLon/2);
        Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        Double d = r * c;
        return d;
    }

    @PostMapping("/closeto")
    public Collection<Obra> getObrasClose(@RequestBody Map<String, Double> json){
        Collection<Obra> col = new ArrayList<Obra>();
        Double latitude = json.get("latitude");
        Double longitude = json.get("longitude");
        for(Obra obra : this.getObras()) {
        	Double distance = getDistance(obra.getLatitude(), obra.getLongitude(), latitude, longitude);
        	if(distance <= 5) {
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