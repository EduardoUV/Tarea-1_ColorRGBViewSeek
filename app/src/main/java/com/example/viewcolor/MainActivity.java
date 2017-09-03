package com.example.viewcolor;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


/* Programacion de los textos y los seek de la actividad principal*/

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar1, seekBar2, seekBar3;
    TextView textView1, textView2, textView3;
    View view1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        view1 = findViewById(R.id.view1);

        textView1 = (TextView) findViewById(R.id.txt1);
        textView2 = (TextView) findViewById(R.id.txt2);
        textView3 = (TextView) findViewById(R.id.txt3);

        seekBar1 = (SeekBar) findViewById(R.id.barra1);
        seekBar2 = (SeekBar) findViewById(R.id.barra2);
        seekBar3 = (SeekBar) findViewById(R.id.barra3);

      /* Inicializando los textview */

        textView1.setText("" + seekBar1.getProgress() + "/" + seekBar1.getMax());
        textView2.setText("" + seekBar2.getProgress() + "/" + seekBar2.getMax());
        textView3.setText("" + seekBar3.getProgress() + "/" + seekBar3.getMax());

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView1.setText("R:" + seekBar1.getProgress() + " / " + seekBar1.getMax());
                view1.setBackgroundColor(Color.argb(255,seekBar1.getProgress(),seekBar2.getProgress(),seekBar3.getProgress()));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView2.setText("G:" + seekBar2.getProgress() + " / " + seekBar2.getMax());
                view1.setBackgroundColor(Color.argb(255,seekBar1.getProgress(),seekBar2.getProgress(),seekBar3.getProgress()));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView3.setText("B:" + seekBar3.getProgress() + " / " + seekBar3.getMax());
                view1.setBackgroundColor(Color.argb(255,seekBar1.getProgress(),seekBar2.getProgress(),seekBar3.getProgress()));
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        /* Programando el boton de salir */

         Button boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}