package com.example.projetointegracao;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Henrique
 */
public class ProjetoIntegracao {
	
	

	//classe que foi utilizada para testar a classe "ServidorMensagem".
    
    public static void main(String[] args) {
        
        String registrationId = "APA91bHn2NKIToOqNYMomoiauixom0O3mrhF6a95G2jIDx1UI8iNWGt1qyisJaltJPezk50zE5LRj7wxa31lt-cyjTe3VXcCDo1CVm0jTNuwVfUOBBaRdgdnwJ62g02gSlZf7UGUEYKoxbcO1JtwPs5UR8Xkmq8ES6zeb9Siff2rh5_ZZhAM3Y8";
        try {
            ServidorMensagem.enviarMensagem(registrationId, "mensagem");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());        }
        
    }
}
