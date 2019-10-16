package com.example.appslab5eaguilar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DatosActivity extends AppCompatActivity {

    private TextView tv_nom;
    private TextView tv_ced;
    private TextView tv_grup;
    private TextView tv_tema;
    private TextView tv_usr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        this.load();
    }


    private void load(){
        tv_nom = (TextView)findViewById(R.id.TV_nom);
        tv_ced = (TextView)findViewById(R.id.TV_cip);
        tv_grup = (TextView)findViewById(R.id.TV_grup);
        tv_tema = (TextView)findViewById(R.id.TV_tema);
        tv_usr = (TextView)findViewById(R.id.TV_usr);

    }



}
