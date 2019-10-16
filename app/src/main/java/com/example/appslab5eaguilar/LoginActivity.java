package com.example.appslab5eaguilar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;

import android.widget.EditText;
import android.widget.ImageView;

import java.util.regex.Pattern;

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
        this.DatosUsuario();//sharedPrefernces

    }


    protected void load(){
        edtUsr = (EditText) findViewById(R.id.ETusr);
        edtPass = (EditText)findViewById(R.id.ETpass);
        img = (ImageView)findViewById(R.id.imgLog);
        img.setImageResource(R.drawable.login_icon);
    }

    //enviar datos a la siguiente actividad
    public void SignUp(View view){
        if (verif()){
            Intent intent = new Intent(this,DatosActivity.class);// parametros actividad actual, Activity a donde se dirige
            intent.putExtra("usr",edtUsr.getText().toString());
            //intent.putExtra("pass",edtPass.getText().toString());
            startActivity(intent);
        }
    }

    private boolean validarEmail(String email) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(email).matches();
    }

    public Boolean verif(){
        if (validarEmail(edtUsr.getText().toString())){
            if (edtUsr.getText().toString().equals("elieaguilar91@gmail.com") && edtPass.getText().toString().equals("1234")){
                return true;
            }
        }
        return false;
    }

    //datos con sharedPreference
    public void DatosUsuario(){
        //CREACION DEL ARCHIVO SHAREDPREFERENCES
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        //CREACION DE VARIABLE PARA EDITAR EL ARCHIVO SHAREDPREFERENCES
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("nom","Eliecer");
        editor.putString("ced","2-741-1287");
        editor.putString("grup","1IL141");
        editor.putString("tema","Laboratorio 5");

        editor.commit();//completa el proceso de guardado de la informacion
    }



}
