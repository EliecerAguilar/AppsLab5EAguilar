package com.example.appslab5eaguilar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //metodo para calcular tamano de pantalla
    public String tamanoX(){
        DisplayMetrics tam = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(tam);
        int width = tam.widthPixels; // ancho absoluto en pixels
        int height = tam.heightPixels; // alto absoluto en pixels

        float xDP = tam.xdpi;
        float yDP = tam.ydpi;

        float ret = (float) (xDP*0.3);

        String r = Float.toString(ret);
        return  r;

    }
}
