package org.iesfm.ejercicioformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cargar(View v) {
        EditText etNombre = (EditText) findViewById(R.id.etNombre);
        EditText etApellido = (EditText) findViewById(R.id.etApellido);

        TextView tvValorNombre = (TextView) findViewById(R.id.tvValorNombre);
        TextView tvValorApellido = (TextView) findViewById(R.id.tvValorApellido);


        // prueba para concatenar datos
        tvValorNombre.setText(etNombre.getText().toString() + etApellido.getText().toString());

        tvValorApellido.setText(etApellido.getText().toString());
    }
}