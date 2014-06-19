package test;

import java.util.ArrayList;

import junit.framework.TestCase;

import org.apache.http.HttpEntity;
import org.junit.Test;

import com.example.projetointegracaoservidor.RegId;
import com.example.projetointegracaoservidor.ServidorMensagem;

public class ServidorTeste extends TestCase{
	
	@Test
	public void testAddRegId(){
		String regId = "APA91bFqSsbEu4QLVokTvKnZ6cEkOq2Q0UZHwCkKbfX8jW8cZ_Z9Vlc-9Mjpd77gdvMIvSxSDWkEm8aRwAtRX3Em_k0BVQUBqbe3uKoMj13LwuNmI2IoSs0YEOCWcMFrRbAiZ_beym5JZrSgMMYncsmFHd6tZDnUd1Kdpei81l2SA1Oc9c6rDAY";
		boolean retornado = RegId.addId(regId);
		boolean esperado = true;
		
		assertEquals(esperado, retornado);
	}
	
	
	
	
	@Test
	public void testEnviarMensagemUnicoId() {
		
		String regId = "APA91bFqSsbEu4QLVokTvKnZ6cEkOq2Q0UZHwCkKbfX8jW8cZ_Z9Vlc-9Mjpd77gdvMIvSxSDWkEm8aRwAtRX3Em_k0BVQUBqbe3uKoMj13LwuNmI2IoSs0YEOCWcMFrRbAiZ_beym5JZrSgMMYncsmFHd6tZDnUd1Kdpei81l2SA1Oc9c6rDAY";
		try {
			ServidorMensagem.enviarMensagemUnicoId(regId, "Notificação Teste1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
