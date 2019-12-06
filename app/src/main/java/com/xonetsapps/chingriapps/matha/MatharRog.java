package com.xonetsapps.chingriapps.matha;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.xonetsapps.chingriapps.Koronio;
import com.xonetsapps.chingriapps.MainActivity;
import com.xonetsapps.chingriapps.R;
import com.xonetsapps.chingriapps.RogNirnoy;

public class MatharRog extends AppCompatActivity {
    Toolbar toolbar,toolbar2;
    Dialog dialog;
    final Context context = this;
    ViewFlipper viewFlipper;
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


        dialog = new Dialog(context, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.setContentView(R.layout.menu_view);


        viewFlipper = (ViewFlipper)dialog.findViewById(R.id.viewFlipper);
        Button details = (Button) dialog.findViewById(R.id.goToPage);
        Button bPrv = (Button) dialog.findViewById(R.id.prv);
        Button bNxt = (Button) dialog.findViewById(R.id.nxt);
        toolbar2 = (Toolbar) dialog.findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);
        // if button is clicked, close the custom dialog
        bPrv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showNext();
            }
        });
        bNxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.showPrevious();
            }
        });

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MatharRog.this,Rog1.class);
                startActivity(intent);
                dialog.cancel();
            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                // Handle the menu item
                return true;
            }
        });

        dialog.show();



    }

    public void cancel(View view){
        dialog.cancel();
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
    public boolean onCreateOptionsMenu(Menu paramMenu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, paramMenu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }
        if (item.getItemId() == R.id.action_search) {
            finish();
            Intent intent= new Intent(this, MainActivity.class);
            startActivity(intent);

            // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }

}
