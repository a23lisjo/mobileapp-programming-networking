package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=a23lisjo";

    ArrayList<owl> owls= new ArrayList<>();
    Gson gson = new Gson();
    String json = gson.toJson(owls);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonTask (this).execute(JSON_URL);



        /*ArrayList<mountain> mountains = new ArrayList<>();
        mountains.add( new mountain("k2"));*/


    }

    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);

        Type type = new TypeToken<ArrayList<owl>>() {}.getType();
        ArrayList<owl> owls = gson.fromJson(json, type);

        RecyclerView recycler_view = findViewById(R.id.widgetrecycler);

        recyclerviewadapter adapter = new recyclerviewadapter (this, owls);
        recycler_view.setAdapter(adapter);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        adapter.notifyDataSetChanged();

    }

}
