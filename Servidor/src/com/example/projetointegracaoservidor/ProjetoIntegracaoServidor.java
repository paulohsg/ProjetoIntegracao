package com.example.projetointegracaoservidor;



public class ProjetoIntegracaoServidor {

	public static void main(String[] args) {
		
		String registrationId = "APA91bHn2NKIToOqNYMomoiauixom0O3mrhF6a95G2jIDx1UI8iNWGt1qyisJaltJPezk50zE5LRj7wxa31lt-cyjTe3VXcCDo1CVm0jTNuwVfUOBBaRdgdnwJ62g02gSlZf7UGUEYKoxbcO1JtwPs5UR8Xkmq8ES6zeb9Siff2rh5_ZZhAM3Y8";
        try {
            ServidorMensagem.enviarMensagem(registrationId, "mensagem");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());        }
        
    }

	}


