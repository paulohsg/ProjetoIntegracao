package com.example.projetointegracaoservidor;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

public class ServidorMensagem {
	
	
		
		//Classe responsável por enviar as mensagens para aplicação cliente.

	    public static final String URL_GCM = "https://android.googleapis.com/gcm/send";
	    public static final String SENDER_ID = "AIzaSyBuTRXZEmZT9GVDczwCmZJEHqn8KjYCXtg";
	    
	    
	    public static void enviarMensagemMultiplosIds(ArrayList<String> ids, String mensagem){
	    	
	    	for(String id : ids){
	    		try {
					enviarMensagemUnicoId(id, mensagem);
				} catch (Exception e) {
					e.printStackTrace();
				}
	    	}
	    	
	    }
	    

	    public static HttpEntity enviarMensagemUnicoId(String regId, String mensagem) throws Exception {
	        // Criando uma instancia de HttpClient.  
	        HttpEntity entity;
	        CloseableHttpClient httpclient = HttpClients.createDefault();
	        try {

	            //Criando uma instancia de HttpPost, com o endereço do serviço.
	            HttpPost httpost = new HttpPost(URL_GCM);
	            httpost.setHeader("Authorization", "key="+SENDER_ID);
	            httpost.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
	            

	            //Adicionando os parametros em uma lista do tipo NameValuePair.

	            List<NameValuePair> nvps = new ArrayList<NameValuePair>();
	            nvps.add(new BasicNameValuePair("registration_id", regId));
	            nvps.add(new BasicNameValuePair("data.mensagem", mensagem));
	            
	            httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));

	            // Executando a requisisção.
	            CloseableHttpResponse response = httpclient.execute(httpost);
	            System.out.println("Status da resposta:" + response.getStatusLine());
	            try {
	                // Atribui uma resposta a uma entidade.
	                entity = response.getEntity();
	            } finally {
	                // Fecha a resposta
	                response.close();
	            }
	        } finally {
	            httpclient.close();
	        }


	        return entity;

	    }
	    
	    
	}


