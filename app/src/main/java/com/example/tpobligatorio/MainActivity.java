package com.example.tpobligatorio;
import android.content.Intent;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private modoAvion eventoAvion ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        eventoAvion = new modoAvion();
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(eventoAvion, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
    }



    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(eventoAvion);
    }
}