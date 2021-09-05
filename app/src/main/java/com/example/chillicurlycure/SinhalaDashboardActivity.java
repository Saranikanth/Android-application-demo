package com.example.chillicurlycure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SinhalaDashboardActivity extends AppCompatActivity {
    ImageButton sinhalasymptom;
    ImageButton sinhalaremedy;
    ImageButton sinhalalanguage;
    ImageButton sinhalapredict;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinhala_dashboard);

        sinhalasymptom = findViewById(R.id.symptom_sinhala);
        sinhalasymptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navigate_to_sinhalasymptoms();
            }
        });

        sinhalaremedy = findViewById(R.id.remedy_sinhala);
        sinhalaremedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navigate_to_sinhalaremedy();
            }
        });

        sinhalalanguage = findViewById(R.id.language_sinhala);
        sinhalalanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navigate_to_sinhala_language();
            }
        });

        sinhalapredict = findViewById(R.id.predict_sinhala);
        sinhalapredict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                navigate_to_sinhala_predict();
            }
        });
    }

    public void navigate_to_sinhalasymptoms(){
        Intent symptom_intent = new Intent(SinhalaDashboardActivity.this,SinhalaSymptomActivity.class);
        startActivity(symptom_intent);
    }

    public void navigate_to_sinhalaremedy(){
        Intent remedy_intent = new Intent(SinhalaDashboardActivity.this,SinhalaRemedyActivity.class);
        startActivity(remedy_intent);
    }

    public void navigate_to_sinhala_language(){
        Intent language_intent = new Intent(SinhalaDashboardActivity.this, LanguageActivity.class);
        startActivity(language_intent);
        finish();
    }

    private void navigate_to_sinhala_predict(){
        Intent predict_intent_sinhala = new Intent(SinhalaDashboardActivity.this, SinhalaPredictActivity.class);
        startActivity(predict_intent_sinhala);
    }
}