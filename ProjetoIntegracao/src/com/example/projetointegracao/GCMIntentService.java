package com.example.projetointegracao;

import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;


public class GCMIntentService extends IntentService{
	
	public static final int ID_NOTIFICACAO = 1;
    private NotificationManager gerenciadorDeNotificacao;
    NotificationCompat.Builder builder;
    public static final String TAG = "GCMIntentService";
    
    public GCMIntentService() {
        super("GCMIntentService");
    }

	@Override
	protected void onHandleIntent(Intent intent) {
		
		Bundle extras = intent.getExtras();
        GoogleCloudMessaging gcm = GoogleCloudMessaging.getInstance(this);
        
        String messageType = gcm.getMessageType(intent);
		
        if (!extras.isEmpty()) {  // has effect of unparcelling Bundle
            
            if (GoogleCloudMessaging.MESSAGE_TYPE_SEND_ERROR.equals(messageType)) {
                sendNotification("Erro no envio: " + extras.toString());
            
            } else if (GoogleCloudMessaging.MESSAGE_TYPE_DELETED.equals(messageType)) {
                sendNotification("Mensagens apagadas no servidor: " +
                        extras.toString());
            
            } else if (GoogleCloudMessaging.MESSAGE_TYPE_MESSAGE.equals(messageType)) {
                // This loop represents the service doing some work.
                for (int i=0; i<5; i++) {
                    Log.i(TAG, "Working... " + (i+1) + "/5 @ " + SystemClock.elapsedRealtime());
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                    }
                }
                
                Log.i(TAG, "Completed work @ " + SystemClock.elapsedRealtime());
                sendNotification("Recebido: " + extras.toString());
                Log.i(TAG, "Recebido: " + extras.toString());
            }
        }
        
        GCMBroadcastReceiver.completeWakefulIntent(intent);
    }
	
	
	private void sendNotification(String msg) {
        gerenciadorDeNotificacao = (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);

        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, new Intent(this, DisplayMessageActivity.class), 0);

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this)
        .setSmallIcon(R.drawable.ic_launcher)
        .setContentTitle("GCM Notification")
        .setStyle(new NotificationCompat.BigTextStyle()
        .bigText(msg))
        .setContentText(msg);

        mBuilder.setContentIntent(contentIntent);
        gerenciadorDeNotificacao.notify(ID_NOTIFICACAO, mBuilder.build());
    }
        
	}
    