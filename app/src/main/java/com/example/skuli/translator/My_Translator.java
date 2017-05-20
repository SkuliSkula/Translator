package com.example.skuli.translator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.api.translate.Language;
import com.google.api.translate.Translate;

public class My_Translator extends AppCompatActivity {

    private Button btnTranslate;
    private TextView txtResults;
    private EditText txtToTranslate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__translator);
        initView();
    }

    private void initView() {
        this.btnTranslate = (Button) findViewById(R.id.btnTranslate);
        this.txtResults = (TextView) findViewById(R.id.txtResults);
        this.txtToTranslate = (EditText) findViewById(R.id.txtToTranslate);
    }
}
