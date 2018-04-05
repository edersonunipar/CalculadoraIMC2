package com.ederson.oliveira.calculadoraimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class segundaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        String dicas[] = {"exercicio", "malhar", "corrida", "nadar"};

        ListAdapter adapterDicas =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dicas);


        ListView theListView = (ListView)findViewById(R.id.theListView);
        theListView.setAdapter(adapterDicas);

    }
}
