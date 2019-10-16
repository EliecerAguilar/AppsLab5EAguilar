package com.example.appslab5eaguilar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUsr;
    private EditText edtPass;
    //private Button btnLogin;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.load();

    }


    protected void load(){
        edtUsr = (EditText) findViewById(R.id.ETusr);
        edtPass = (EditText)findViewById(R.id.ETpass);
        img = (ImageView)findViewById(R.id.imgLog);
        img.setImageResource(R.drawable.login_icon);
    }

    //enviar datos a la siguiente actividad
    public void SignUp(View view){
        Intent intent = new Intent(this,DatosActivity.class);// parametros actividad actual, Activity a donde se dirige
        intent.putExtra("usr",edtUsr.getText().toString());
        intent.putExtra("pass",edtPass.getText().toString());
        startActivity(intent);



    }



}
