package com.rcustodio.philippinesconstitution1987.Article13;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import com.rcustodio.philippinesconstitution1987.Article13AActivity;
import com.rcustodio.philippinesconstitution1987.Article13BActivity;
import com.rcustodio.philippinesconstitution1987.Article13CActivity;
import com.rcustodio.philippinesconstitution1987.Article13DActivity;
import com.rcustodio.philippinesconstitution1987.Article13EActivity;
import com.rcustodio.philippinesconstitution1987.Article13FActivity;
import com.rcustodio.philippinesconstitution1987.Article13GActivity;
import com.rcustodio.philippinesconstitution1987.Article13HActivity;
import com.rcustodio.philippinesconstitution1987.R;

public class Article13Activity extends AppCompatActivity {

    CardView articleButton13A
            ,articleButton13B
            ,articleButton13C
            ,articleButton13D
            ,articleButton13E
            ,articleButton13F
            ,articleButton13G
            ,articleButton13H;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article13);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        articleButton13A = findViewById(R.id.articles13BtnA);
        articleButton13B = findViewById(R.id.articles13BtnB);
        articleButton13C = findViewById(R.id.articles13BtnC);
        articleButton13D = findViewById(R.id.articles13BtnD);
        articleButton13E = findViewById(R.id.articles13BtnE);
        articleButton13F = findViewById(R.id.articles13BtnF);
        articleButton13G = findViewById(R.id.articles13BtnG);
        articleButton13H = findViewById(R.id.articles13BtnH);


        articleButton13A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Article13Activity.this, Article13AActivity.class);
                startActivity(intent);
            }
        });

        articleButton13B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(Article13Activity.this, Article13BActivity.class);
                startActivity(intent);

            }
        });

        articleButton13C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Article13Activity.this, Article13CActivity.class);
                startActivity(intent);
            }
        });

        articleButton13D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Article13Activity.this, Article13DActivity.class);
                startActivity(intent);

            }
        });

        articleButton13E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Article13Activity.this, Article13EActivity.class);
                startActivity(intent);
            }
        });

        articleButton13F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Article13Activity.this, Article13FActivity.class);
                startActivity(intent);

            }
        });

        articleButton13G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Article13Activity.this, Article13GActivity.class);
                startActivity(intent);
            }
        });

        articleButton13H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Article13Activity.this, Article13HActivity.class);
                startActivity(intent);

            }
        });





        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
