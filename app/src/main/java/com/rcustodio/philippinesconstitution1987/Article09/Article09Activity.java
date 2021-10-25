package com.rcustodio.philippinesconstitution1987.Article09;

import android.content.Intent;
import android.os.Bundle;

import com.rcustodio.philippinesconstitution1987.Article09AActivity;
import com.rcustodio.philippinesconstitution1987.Article09BActivity;
import com.rcustodio.philippinesconstitution1987.Article09CActivity;
import com.rcustodio.philippinesconstitution1987.Article09DActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;

import com.rcustodio.philippinesconstitution1987.R;

public class Article09Activity extends AppCompatActivity {

    CardView articleButton9A,articleButton9B,articleButton9C,articleButton9D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article09);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        articleButton9A = findViewById(R.id.articles09BtnA);
        articleButton9B = findViewById(R.id.articles09BtnB);
        articleButton9C = findViewById(R.id.articles09BtnC);
        articleButton9D = findViewById(R.id.articles09BtnD);


        articleButton9A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Article09Activity.this, Article09AActivity.class);
                startActivity(intent);
            }
        });

        articleButton9B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Article09Activity.this, Article09BActivity.class);
                startActivity(intent);

            }
        });

        articleButton9C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Article09Activity.this, Article09CActivity.class);
                startActivity(intent);

            }
        });

        articleButton9D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Article09Activity.this, Article09DActivity.class);
                startActivity(intent);


            }
        });




        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
