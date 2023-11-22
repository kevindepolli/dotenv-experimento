/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.dotenv.experimento;

import io.github.cdimascio.dotenv.Dotenv;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin
 */
public class DotenvExperimento {
    
    

    public static void main(String[] args) {
   
        Dotenv dotenv = Dotenv.load();
        var SGBD_escolhido = dotenv.get("SGBD");
        System.out.println(SGBD_escolhido);
        
        try {
            Class<?> SGBD = Class.forName(SGBD_escolhido);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DotenvExperimento.class.getName()).log(Level.SEVERE, null, ex);
        }
        Object dbInstance = clazz.getDeclaredConstructor().newInstance();
        
    }
}
