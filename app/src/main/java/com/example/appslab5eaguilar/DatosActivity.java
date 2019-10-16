package com.example.appslab5eaguilar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
        this.cargarDatos();
    }


    private void load(){
        tv_nom = (TextView)findViewById(R.id.TV_nom);
        tv_ced = (TextView)findViewById(R.id.TV_cip);
        tv_grup = (TextView)findViewById(R.id.TV_grup);
        tv_tema = (TextView)findViewById(R.id.TV_tema);
        tv_usr = (TextView)findViewById(R.id.TV_usr);
        tv_usr.setText(getIntent().getStringExtra("usr").toString());
    }

    private void cargarDatos(){
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        tv_nom.setText(preferences.getString("nom","desconocido"));
        tv_ced.setText(preferences.getString("ced","0-000-0000"));
        tv_grup.setText(preferences.getString("grup","desconocido"));
        tv_tema.setText(preferences.getString("tema","desconocido"));
    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.item_cal:
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.example.appslab3eaguilar");
                if (intent != null)
                    startActivity(intent);//null pointer check en caso de que el paquete no se encuentre
                else
                    Toast.makeText(this, "packete no encontrado",Toast.LENGTH_LONG).show();

            break;
            case R.id.item_LV:
                Intent intent2 = getPackageManager().getLaunchIntentForPackage("com.example.jotaz.listviewexample");
                if (intent2 != null)
                    startActivity(intent2);//null pointer check en caso de que el paquete no se encuentre
                else
                    Toast.makeText(this, "packete no encontrado",Toast.LENGTH_LONG).show();
            break;
            default:
                Toast.makeText(this, "error fuera de rango",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }


}
