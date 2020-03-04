/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buscaminas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.buscaminas.FindMines;
/**
 *
 * @author ignis
 */
public class FindMinesTest {
    
    @Test
    public void testReadDataFromBarcode(){
        
        String [][]testOne = {
                        {"*",".",".","."},
                        {".",".",".","."},
                        {".","*",".","."},
                        {".",".",".","."}
                    };
        String [][] result = FindMines.find(testOne, 4, 4);
        
        assertEquals("*", result[0][0]);
        assertEquals("1", result[0][1]);
        assertEquals("0", result[0][2]);
        assertEquals("0", result[0][3]);
        assertEquals("2", result[1][0]);
        assertEquals("2", result[1][1]);
        assertEquals("1", result[1][2]);
        assertEquals("0", result[1][3]);
        assertEquals("1", result[2][0]);
        assertEquals("*", result[2][1]);
        assertEquals("1", result[2][2]);
        assertEquals("0", result[2][3]);
        assertEquals("1", result[3][0]);
        assertEquals("1", result[3][1]);
        assertEquals("1", result[3][2]);
        assertEquals("0", result[3][3]);
    }
}
