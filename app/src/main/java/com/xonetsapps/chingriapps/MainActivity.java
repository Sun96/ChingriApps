package com.xonetsapps.chingriapps;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    long lastPressedTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }
    public void rog_nirnoy(View view)
    {
        Intent intent= new Intent(this,RogNirnoy.class);
        startActivity(intent);
    }


    public void rog_protikar(View view)
    {
        Intent intent= new Intent(this,Koronio.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }
    public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
    {
        int i = 0;
        boolean bool = true;
        //Toast.makeText(getApplicationContext(), "Press Back To Exit", 0).show();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        return bool;
    }
}

