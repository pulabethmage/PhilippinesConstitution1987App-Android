package com.rcustodio.philippinesconstitution1987.Article10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.rcustodio.philippinesconstitution1987.Article10AActivity;
import com.rcustodio.philippinesconstitution1987.Article10BActivity;
import com.rcustodio.philippinesconstitution1987.R;

public class Article10Activity extends AppCompatActivity {

    CardView articleButton10A,articleButton10B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article10);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        articleButton10A = findViewById(R.id.articles10BtnA);
        articleButton10B = findViewById(R.id.articles10BtnB);

        articleButton10A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Article10Activity.this, Article10AActivity.class);
                startActivity(intent);
            }
        });

        articleButton10B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Article10Activity.this, Article10BActivity.class);
                startActivity(intent);

            }
        });





        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
