package com.rhinepereira.valorantsoundboard;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageButton one = (ImageButton) this.findViewById(R.id.Neonult);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.neon_ult);
        one.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });
        ImageButton two = (ImageButton) this.findViewById(R.id.razeult);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.raze_ult);
        two.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp1.start();
            }
        });
        ImageButton three = (ImageButton) this.findViewById(R.id.sovault);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.sova_ult);
        three.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp2.start();
            }
        });
        ImageButton four = (ImageButton) this.findViewById(R.id.spikedef);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.val_def_amp);
        four.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                mp3.start();
            }
        });
    }




}