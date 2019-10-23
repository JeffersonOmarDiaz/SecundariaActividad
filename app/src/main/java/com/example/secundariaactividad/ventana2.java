package com.example.secundariaactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ventana2 extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        tv1 =(TextView)findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();
        tv1.setText(bundle.getString("nombre"));
    }

    public void cerrarActivity(View view){
        finish();
    }

}
