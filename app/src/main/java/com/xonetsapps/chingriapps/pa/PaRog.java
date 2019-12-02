package com.xonetsapps.chingriapps.pa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.xonetsapps.chingriapps.R;
import com.xonetsapps.chingriapps.matha.Rog1;
import com.xonetsapps.chingriapps.matha.Rog2;
import com.xonetsapps.chingriapps.matha.Rog3;
import com.xonetsapps.chingriapps.matha.Rog4;

public class PaRog extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pa_rog);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    public void pr1(View view)
    {
        Intent intent= new Intent(this,Prog1.class);
        startActivity(intent);
    }


    public void pr2(View view)
    {
        Intent intent= new Intent(this,Prog2.class);
        startActivity(intent);
    }

    public void pr3(View view)
    {
        Intent intent= new Intent(this,Prog3.class);
        startActivity(intent);
    }


    public void pr4(View view)
    {
        Intent intent= new Intent(this,Prog4.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }
}
