package com.example.tpobligatorio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class modoAvion extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean avion = intent.getBooleanExtra("state",false);

        if(avion){
            Toast.makeText(context, "El modo de avion se activo", Toast.LENGTH_LONG).show();
            Intent llamada = new Intent(Intent.ACTION_DIAL);
            llamada.setData(Uri.parse("Tel: 2664553747"));
            llamada.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(llamada);

        }else{
            Toast.makeText(context, "El modo de avion se ha desactivado", Toast.LENGTH_LONG).show();
        }

    }
}