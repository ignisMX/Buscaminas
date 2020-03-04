/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buscaminas;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author ignis
 */
public class ReadFile {

    static String [][] read(String path) {
        int times = 0, counter = 0;
        int rows = 0, columns =0;
        String [][] mines = null;
        try (BufferedReader buffer = Files.newBufferedReader(Paths.get(path))) {
            String line;
            while ((line = buffer.readLine()) != null) {
                if(times == 0){
                    String [] size = line.split("");
                    rows = Integer.valueOf(size[0]);
                    columns = Integer.valueOf(size[1]);
                    mines = new String[rows][columns];
                }
                else{
                    String [] elements = line.split("");
                    for(int j = 0; j < columns; j ++){
                        mines[counter][j] = elements[j];
                    }
                    counter ++;
                }
                times ++;
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        
        return FindMines.find(mines, rows, columns);
    }
    
    public static void runMines(String Path){
        String [][] result = read(Path);
        
        for(int i = 0; i < result.length; i ++){
            for(int j = 0; j < result[i].length; j ++){
                System.out.print(result[i][j]);
            }
            System.out.println("");
        }
    }
}
