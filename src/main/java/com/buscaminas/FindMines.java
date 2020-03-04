/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buscaminas;

/**
 *
 * @author ignis
 */
public class FindMines {
    
    public static String [][] find(String [][] collection, int row, int column){
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < column; j ++){
                int counter = 0;
                if(collection[i][j] == "."){
                   
                    //Accede a todos los de la fila previa
                    if(i -1 > -1){
                        if(collection[i-1][j] == "*") counter ++;
                        if(j - 1 > -1){
                            if(collection[i-1][j-1] == "*") counter ++;
                        }
                        if(j + 1 < column){
                            if(collection[i-1][j+1] == "*") counter ++;
                        }
                    }
                    
                    //accede a todos los de la siguiente fila
                    if(i + 1 < row){
                        if(collection[i+1][j] == "*") counter ++;
                        if(j - 1 > -1){
                            if(collection[i+1][j-1] == "*") counter ++;
                        }
                        if(j + 1 < column){
                            if(collection[i+1][j+1] == "*") counter ++;
                        }
                    }
                    
                    //accede a los laterales
                    if( j +1 < column){
                        if(collection[i][j+1] == "*") counter ++;
                    }
                    
                    if( j - 1 > -1){
                        if(collection[i][j-1] == "*") counter ++;
                    }
                    
                    collection[i][j] = String.valueOf(counter);
                }
                
            }
        }
    
        return collection;
    }
}
