package com.example.politicosgo.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.example.politicosgo.services.ObraService;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStreamReader;
import java.io.FileInputStream;

public class CSVController {


        public ArrayList<String[]> run(String csvFile) {

                ArrayList<String[]> out = new ArrayList<String[]>();

		BufferedReader myBuffer = null;		        
        
		String csvDivisor = ",";
                try {

			myBuffer = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile), "UTF-8"));

                        String line = myBuffer.readLine();

                        while (line != null) {
                 			
                                String[] lineSplited = line.split(csvDivisor);

                                out.add(lineSplited);

                                line = myBuffer.readLine();


                        }

                        myBuffer.close();

                        return out;

                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                } finally {
                        if (myBuffer != null) {
                                try {
                                        myBuffer.close();
                                } catch (IOException e) {
                                        e.printStackTrace();
                                }
                        }
                }
                return out;

        }
}

