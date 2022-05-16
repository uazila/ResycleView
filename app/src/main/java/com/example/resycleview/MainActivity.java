package com.example.resycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler);

        ArrayList<String> names=new ArrayList<>();
        names.add("Азила");
        names.add("Асан");
        names.add("Усон");
        names.add("Азамат");
        names.add("Айдан");
        names.add("Азиз");
        names.add("Айгул");
        names.add("Айжан");
        names.add("Бека");
        names.add("Венера");
        names.add("Гульзана");
        names.add("Дастан");
        names.add("Динара");
        names.add("Зарина");
        names.add("Каныкей");
        names.add("Канышай");
        names.add("Кубаныч");
        names.add("Мээрим");
        names.add("Бека");
        names.add("Венера");
        names.add("Гульзана");
        names.add("Дастан");
        names.add("Динара");
        names.add("Зарина");
        names.add("Каныкей");
        names.add("Канышай");
        names.add("Кубаныч");
        names.add("Мээрим");

        NameAdapter adapter=new NameAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}