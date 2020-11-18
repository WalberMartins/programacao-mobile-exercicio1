package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Data date;

    private TextView textEditableDate;
    private Button btnConclude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        date = (Data) getIntent().getExtras().getSerializable("date");
        textEditableDate = findViewById(R.id.textEditableDate);
        btnConclude = findViewById(R.id.btnConclude);

        updateDateText();

        btnConclude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });
    }

    private void updateDateText() {
        textEditableDate.setText(date.toString());
    }

    public void incrementDay(View view) {
        date.incrementaDia();
        updateDateText();
    }

    public void incrementMonth(View view) {
        date.incrementaMes();
        updateDateText();
    }

    public void incrementYear(View view) {
        date.incrementaAno();
        updateDateText();
    }
}