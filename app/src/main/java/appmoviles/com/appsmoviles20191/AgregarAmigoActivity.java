package appmoviles.com.appsmoviles20191;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.UUID;

import appmoviles.com.appsmoviles20191.model.Amigo;

public class AgregarAmigoActivity extends AppCompatActivity {

    private EditText et_nombre;
    private EditText et_edad;
    private EditText et_correo;
    private EditText et_telefono;

    private Button btn_agregar_amigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_amigo);

        et_nombre = findViewById(R.id.et_nombre);
        et_edad = findViewById(R.id.et_edad);
        et_correo = findViewById(R.id.et_correo);
        et_telefono = findViewById(R.id.et_telefono);

        btn_agregar_amigo = findViewById(R.id.btn_agregar_amigo);

        btn_agregar_amigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Amigo amigo = new Amigo(UUID.randomUUID().toString(),
                        et_nombre.getText().toString(),
                        et_edad.getText().toString(),
                        et_telefono.getText().toString(),
                        et_correo.getText().toString());
                //Agregar amigo a DB
            }
        });
    }

    //Cargamos
    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        String nombre = sp.getString("nombre", "");
        String edad = sp.getString("edad", "");
        String correo = sp.getString("correo", "");
        String telefono = sp.getString("telefono", "");

        et_nombre.setText(nombre);
        et_edad.setText(edad);
        et_correo.setText(correo);
        et_telefono.setText(telefono);
    }

    //Guardamos
    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        sp.edit().putString("nombre", et_nombre.getText().toString())
                .putString("edad", et_edad.getText().toString())
                .putString("correo", et_correo.getText().toString())
                .putString("telefono", et_telefono.getText().toString())
                .apply();
    }
}
