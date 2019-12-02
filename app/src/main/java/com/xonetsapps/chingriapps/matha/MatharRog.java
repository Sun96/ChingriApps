package com.xonetsapps.chingriapps.matha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.xonetsapps.chingriapps.Koronio;
import com.xonetsapps.chingriapps.R;
import com.xonetsapps.chingriapps.RogNirnoy;

public class MatharRog extends AppCompatActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathar_rog);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    public void rog1(View view)
    {
        Intent intent= new Intent(this,Rog1.class);
        startActivity(intent);
    }


    public void rog2(View view)
    {
        Intent intent= new Intent(this,Rog2.class);
        startActivity(intent);
    }

    public void rog3(View view)
    {
        Intent intent= new Intent(this,Rog3.class);
        startActivity(intent);
    }


    public void rog4(View view)
    {
        Intent intent= new Intent(this,Rog4.class);
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
