package com.xonetsapps.chingriapps.matha;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import com.ceylonlabs.imageviewpopup.ImagePopup;
import com.xonetsapps.chingriapps.R;

import java.io.File;
import java.io.IOException;

public class Rog1 extends AppCompatActivity {
    Toolbar toolbar;
    ImageView img1,img2,img3,img4,audioOn1,audioOn2,audioPus1,audioPus2;
    ImagePopup imagePopup;
    MediaPlayer mp1,mp2;
    int a=0,b=0;
    final Context context = this;
    private Button button;
     public int[] imgArry={R.drawable.mid,R.drawable.ch2,R.drawable.ch1,R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rog1);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            img1=(ImageView) findViewById(R.id.img1);
            img2=(ImageView) findViewById(R.id.img2);
            img3=(ImageView) findViewById(R.id.img3);
            img4=(ImageView) findViewById(R.id.img4);

            audioOn1=(ImageView) findViewById(R.id.ado1);
            audioOn2=(ImageView) findViewById(R.id.ado2);
            audioPus1=(ImageView) findViewById(R.id.adoPs1);
            audioPus2=(ImageView) findViewById(R.id.adoPs2);

             mp1 = MediaPlayer.create(this, R.raw.sound1);
            mp2 = MediaPlayer.create(this, R.raw.sound1);

            imgPop(img1,0);
            imgPop(img2,1);
            imgPop(img3,2);
            imgPop(img4,3);

        }

    }
    public void audio1(View view){
        if (b==0) {
            mp1.start();
            audioOn1.setVisibility(View.GONE);
            audioPus1.setVisibility(View.VISIBLE);
            a = 1;
        }else {
            mp2.pause();
            mp1.start();
            audioOn1.setVisibility(View.GONE);
            audioPus1.setVisibility(View.VISIBLE);
            audioPus2.setVisibility(View.GONE);
            audioOn2.setVisibility(View.VISIBLE);
            a = 1;
        }
    }
    public void audioPuss1(View view){

        mp1.pause();
        audioPus1.setVisibility(View.GONE);
        audioOn1.setVisibility(View.VISIBLE);
        a=0;
    }

    public void audio2(View view){

        if (a==0) {
            mp2.start();
            audioOn2.setVisibility(View.GONE);
            audioPus2.setVisibility(View.VISIBLE);
            b=1;
        }else {
            mp1.pause();
            mp2.start();
            audioOn2.setVisibility(View.GONE);
            audioPus2.setVisibility(View.VISIBLE);
            audioPus1.setVisibility(View.GONE);
            audioOn1.setVisibility(View.VISIBLE);
            b=1;
        }

    }
    public void audioPuss2(View view){

        mp2.pause();
        audioPus2.setVisibility(View.GONE);
        audioOn2.setVisibility(View.VISIBLE);
        b=0;

    }
///newwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
public void audio21(View view) throws IOException {

}


    public  void imgPop(final ImageView imageView,final int j){

        /*imagePopup = new ImagePopup(this);
        imagePopup.setWindowHeight(800); // Optional
        imagePopup.setWindowWidth(800); // Optional
        imagePopup.setBackgroundColor(Color.WHITE);  // Optional
        imagePopup.setFullScreen(true); // Optional
        imagePopup.setHideCloseIcon(true);  // Optional
        imagePopup.setImageOnClickClose(true);  // Optional*/

        final int[] i = {j};

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // custom dialog
                final Dialog dialog = new Dialog(context,android.R.style.Theme_Black_NoTitleBar_Fullscreen);
                dialog.setContentView(R.layout.customview);
                dialog.setTitle("Title...");

                // set the custom dialog components - text, image and button
                final TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("index"+i[0]);
                final ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(imgArry[i[0]]);

                Button bPrv = (Button) dialog.findViewById(R.id.prv);
                Button bNxt = (Button) dialog.findViewById(R.id.nxt);
                // if button is clicked, close the custom dialog
                bPrv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (4>i[0]&& i[0] >=0) {

                            image.setImageResource(imgArry[i[0]]);
                            text.setText("index"+i[0]);
                            i[0]--;
                        }else {
                            i[0]=0;
                            dialog.cancel();

                        }
                    }
                });
                bNxt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (0<=i[0]&& i[0]<4) {
                            image.setImageResource(imgArry[i[0]]);
                            text.setText("index"+i[0]);
                            i[0]++;
                        }else
                        {
                            i[0]=0;
                            dialog.cancel();
                        }
                    }
                });

                dialog.show();

            }
        });
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
