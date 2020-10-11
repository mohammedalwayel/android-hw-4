package com.example.wajeb4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList <pokimon> pokeball= new ArrayList<>();

        pokimon p1 = new pokimon("dog",R.drawable.dog_pokimon,200,400,600);
        pokimon p2 = new pokimon("cat",R.drawable.cat_pokimon,200,400,600);
        pokimon p3 = new pokimon("Arbok",R.drawable.robot_,200,400,600);
        pokimon p4 = new pokimon("glastoise",R.drawable.small_pokimon,200,400,600);
        pokimon p5 = new pokimon("becachyou",R.drawable.oip,200,400,600);
        pokimon p6 = new pokimon("strong",R.drawable.tirtl_pokimon,200,400,600);

        pokeball.add(p1);
        pokeball.add(p2);
        pokeball.add(p3);
        pokeball.add(p4);
        pokeball.add(p5);
        pokeball.add(p6);


        RecyclerView rv = findViewById(R.id.recyclerview);
        rv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        adapter_pokimon pa = new adapter_pokimon(pokeball,this);
        rv.setAdapter(pa);
    }
}