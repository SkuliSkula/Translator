package com.example.skuli.translator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.api.translate.Language;
import com.google.api.translate.Translate;

import java.util.ArrayList;

public class My_Translator extends AppCompatActivity {

    private Button btnTranslate;
    private TextView txtResults;
    private EditText txtToTranslate;
    private ListView listViewTranslated;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__translator);
        initView();
        initList();
    }

    private void initView() {
        this.btnTranslate = (Button) findViewById(R.id.btnTranslate);
        this.btnTranslate.setOnClickListener(new TranslateButton());
        this.txtResults = (TextView) findViewById(R.id.txtResults);
        this.txtToTranslate = (EditText) findViewById(R.id.txtToTranslate);
        this.listViewTranslated = (ListView) findViewById(R.id.listTranslated);
    }

    private void initList() {
        list = new ArrayList<>();
        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listViewTranslated.setAdapter(adapter);
    }

    private class TranslateButton implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            String txt = txtToTranslate.getText().toString();
            txtResults.setText(txt);
            list.add(txt);
            adapter.notifyDataSetChanged();
        }
    }
}
