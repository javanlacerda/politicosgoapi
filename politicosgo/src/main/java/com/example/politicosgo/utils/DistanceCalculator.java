package com.example.politicosgo.utils;

public class DistanceCalculator {

	private Double degToRad(Double deg) {
    	return deg * (Math.PI / 180.0);
    }

    public Double getDistance(Double lat1, Double lon1, Double lat2, Double lon2){
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
}
