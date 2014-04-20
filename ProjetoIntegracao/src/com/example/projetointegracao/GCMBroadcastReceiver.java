package com.example.projetointegracao;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

public class GCMBroadcastReceiver extends WakefulBroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		
		//especifica que a classe "GCMIntentService ira manipular o intent.
		ComponentName comp = new ComponentName(context.getPackageName(), GCMIntentService.class.getName());
		
		//inicia o servi�o e mantem o dispositivo acordado enquanto esta em execu��o.
        startWakefulService(context, (intent.setComponent(comp)));
        setResultCode(Activity.RESULT_OK);
		
	}
	
	

}
