package com.versys.logistica_profesional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.onesignal.OneSignal;

public class Menu_Botones extends AppCompatActivity {

   private Button boton_web;
   private static final String ONESIGNAL_APP_ID = "1d80c98a-31e8-405b-b025-66150882a5bb";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);
        setContentView(R.layout.activity_menu_botones);

        boton_web = findViewById(R.id.boton_web);

        boton_web.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(Menu_Botones.this, WebView.class);
                startActivity(intent);
                finish();
            }
        });


    }
}