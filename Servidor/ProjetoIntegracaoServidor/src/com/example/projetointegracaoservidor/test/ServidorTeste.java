package com.example.projetointegracaoservidor.test;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.apache.http.HttpEntity;
import org.junit.Test;

import com.example.projetointegracaoservidor.RegId;
import com.example.projetointegracaoservidor.ServidorMensagem;

public class ServidorTeste extends TestCase{
	
	@Test
	public void testAddRegId(){
		String regId = "APA91bE3rirnfZ3ftST_ufykhLfxp4swqU4K89Pxt-30HT7_P44Sajs4Gg4EC6mW2aZslqqLXODEAPRK3L1MWCEWgecc6KUqqNxZwLEEkAXUfB3TVU9c3Xybk1d4pTJbnC6URSltM1__jvaic4hgn2INUQCxPVOYu8jgMLhcM5UUwPu15TdxlBA";
		boolean retornado = RegId.addId(regId);
		boolean esperado = true;
		
		assertEquals(esperado, retornado);
	}
	
	
	
	
	@Test
	public void testEnviarMensagemUnicoId() {
		
		String regId = "APA91bE3rirnfZ3ftST_ufykhLfxp4swqU4K89Pxt-30HT7_P44Sajs4Gg4EC6mW2aZslqqLXODEAPRK3L1MWCEWgecc6KUqqNxZwLEEkAXUfB3TVU9c3Xybk1d4pTJbnC6URSltM1__jvaic4hgn2INUQCxPVOYu8jgMLhcM5UUwPu15TdxlBA";
		try {
			ServidorMensagem.enviarMensagemUnicoId(regId, "Notificação Teste1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
