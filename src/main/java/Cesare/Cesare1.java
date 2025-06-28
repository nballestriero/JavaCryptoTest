/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cesare;

/**
 *
 * @author user
 */
public class Cesare1 {
    //Attributi
    public String clearMessage;
    public String cipher;
    
    //Metodi
    public Cesare1(String message){
        clearMessage = message;
    }
    public void encrypt() { 
        cipher = ""; 
        for (int i = 0; i < clearMessage.length(); i++) { 
            char c = clearMessage.charAt(i); 
            cipher += (char)(c + 1); // Sposta di 1 nella tabella ASCII 
        } 
         
    }
    public void decrypt(){
        //TODO Implementa il metodo fai diventare il messaggio criptato cipher
        //uguale a clearMessage
    }        
}
