package com.example.projetointegracaocliente;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.gcm.GoogleCloudMessaging;

public class GcmIntentService extends IntentService {

    String mes;
    private Handler handler;
    public static final String EXTRA_MESSAGE = "mensagem";
	public GcmIntentService() {
		super("GcmIntentService");
	}

	@Override
	public void onCreate() {
		super.onCreate();
		handler = new Handler();
	}
	@Override
	protected void onHandleIntent(Intent intent) {
       Bundle extras = intent.getExtras();
       
       GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(this);
      
       String messageType = gcm.getMessageType(intent);

      mes = extras.getString(EXTRA_MESSAGE);
      mostrarToast();
      Log.i("GCM", "Recebido : (" +messageType+")  "+extras.getString(EXTRA_MESSAGE));
      
             
       
       GcmBroadcastReceiver.completeWakefulIntent(intent);

	}
	
	public void mostrarToast(){
		handler.post(new Runnable() {
		    public void run() {
		        Toast.makeText(getApplicationContext(),mes , Toast.LENGTH_LONG).show();
		    }
		 });

	}
	
	
	
	

}