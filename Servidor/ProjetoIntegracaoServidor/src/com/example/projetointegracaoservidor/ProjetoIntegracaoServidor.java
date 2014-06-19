package com.example.projetointegracaoservidor;



public class ProjetoIntegracaoServidor {

	public static void main(String[] args) {
		
		
		String registrationId = "APA91bE3rirnfZ3ftST_ufykhLfxp4swqU4K89Pxt-30HT7_P44Sajs4Gg4EC6mW2aZslqqLXODEAPRK3L1MWCEWgecc6KUqqNxZwLEEkAXUfB3TVU9c3Xybk1d4pTJbnC6URSltM1__jvaic4hgn2INUQCxPVOYu8jgMLhcM5UUwPu15TdxlBA";
        try {
            ServidorMensagem.enviarMensagemUnicoId(registrationId, "Mensagem de notificação.");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());        }
        
    }

	}


