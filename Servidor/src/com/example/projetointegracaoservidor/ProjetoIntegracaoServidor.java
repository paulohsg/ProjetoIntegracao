package com.example.projetointegracaoservidor;



public class ProjetoIntegracaoServidor {

	public static void main(String[] args) {
		
		
		String registrationId = "APA91bFqSsbEu4QLVokTvKnZ6cEkOq2Q0UZHwCkKbfX8jW8cZ_Z9Vlc-9Mjpd77gdvMIvSxSDWkEm8aRwAtRX3Em_k0BVQUBqbe3uKoMj13LwuNmI2IoSs0YEOCWcMFrRbAiZ_beym5JZrSgMMYncsmFHd6tZDnUd1Kdpei81l2SA1Oc9c6rDAY";
        try {
            ServidorMensagem.enviarMensagemUnicoId(registrationId, "oieeeee");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());        }
        
    }

	}


