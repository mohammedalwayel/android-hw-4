package com.example.wajeb4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle br = getIntent().getExtras();
        pokimon pp = (pokimon) br.getSerializable("pokimon");






        ImageView img1 = findViewById(R.id.imageView2);
        TextView name1 = findViewById(R.id.textView4);
        TextView total = findViewById(R.id.textView5);
        TextView t4 = findViewById(R.id.textView6);

       img1.setImageResource(pp.getImage());
       name1.setText(pp.getName());
       total.setText("Attac:"+pp.getAttac());
       t4.setText("Defence"+pp.getDefence());







    }
}










