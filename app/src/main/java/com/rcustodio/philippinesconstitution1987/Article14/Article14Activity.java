package com.rcustodio.philippinesconstitution1987.Article14;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.rcustodio.philippinesconstitution1987.Article14AActivity;
import com.rcustodio.philippinesconstitution1987.Article14BActivity;
import com.rcustodio.philippinesconstitution1987.Article14CActivity;
import com.rcustodio.philippinesconstitution1987.Article14DActivity;
import com.rcustodio.philippinesconstitution1987.Article14EActivity;
import com.rcustodio.philippinesconstitution1987.R;

public class Article14Activity extends AppCompatActivity {

    CardView articleButton14A
            ,articleButton14B
            ,articleButton14C
            ,articleButton14D
            ,articleButton14E;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article14);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        articleButton14A = findViewById(R.id.articles14BtnA);
        articleButton14B = findViewById(R.id.articles14BtnB);
        articleButton14C = findViewById(R.id.articles14BtnC);
        articleButton14D = findViewById(R.id.articles14BtnD);
        articleButton14E = findViewById(R.id.articles14BtnE);



        articleButton14A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Article14Activity.this, Article14AActivity.class);
                startActivity(intent);
            }
        });

        articleButton14B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(Article14Activity.this, Article14BActivity.class);
               startActivity(intent);

            }
        });

        articleButton14C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Intent intent = new Intent(Article14Activity.this, Article14CActivity.class);
                startActivity(intent);
            }
        });

        articleButton14D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Article14Activity.this, Article14DActivity.class);
                startActivity(intent);

            }
        });

        articleButton14E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Article14Activity.this, Article14EActivity.class);
                startActivity(intent);
            }
        });






        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
