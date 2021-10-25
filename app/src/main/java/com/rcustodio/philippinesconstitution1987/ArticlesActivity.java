package com.rcustodio.philippinesconstitution1987;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.rcustodio.philippinesconstitution1987.Article09.Article09Activity;
import com.rcustodio.philippinesconstitution1987.Article10.Article10Activity;
import com.rcustodio.philippinesconstitution1987.Article13.Article13Activity;
import com.rcustodio.philippinesconstitution1987.Article14.Article14Activity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class ArticlesActivity extends AppCompatActivity {

    ListView articlesListView;
    ArrayList<ArticleDataModel> dataModels;
    private static CustomArticlesAdapter adapter;

    private InterstitialAd mInterstitialAd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button


        ///////////AdMob Ads ////////////////
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {}
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2415030290687873/7585348308");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });



//        rcustodio
//        Here are the Admob Ads ID's:
//        App ID: ca-app-pub-2415030290687873~1594655026
//        Banner Ad ID: ca-app-pub-2415030290687873/7776919996
//        Interstitial Ad ID: ca-app-pub-2415030290687873/7585348308

        ////////////AdMob Ads//////////////

        ///// Data Related//
        articlesListView = findViewById(R.id.articlesListView);
        dataModels= new ArrayList<>();

        dataModels.add(new ArticleDataModel("ARTICLE I", "National Territory"));
        dataModels.add(new ArticleDataModel("ARTICLE II", "Declaration of Principles and State Policies"));
        dataModels.add(new ArticleDataModel("ARTICLE III", "Bill of Rights"));
        dataModels.add(new ArticleDataModel("ARTICLE IV", "Citizenship"));
        dataModels.add(new ArticleDataModel("ARTICLE V", "Suffrage"));

        dataModels.add(new ArticleDataModel("ARTICLE VI", "Legislative Department"));
        dataModels.add(new ArticleDataModel("ARTICLE VII", "Executive Department"));
        dataModels.add(new ArticleDataModel("ARTICLE VIII", "Judicial Department"));
        dataModels.add(new ArticleDataModel("ARTICLE IX", "Constitutional Commissions"));
        dataModels.add(new ArticleDataModel("ARTICLE X", "Local Government"));

        dataModels.add(new ArticleDataModel("ARTICLE XI", "Accountability of Public Officers"));
        dataModels.add(new ArticleDataModel("ARTICLE XII", "National Economy and Patrimony"));
        dataModels.add(new ArticleDataModel("ARTICLE XIII", "Social Justice and Human Rights"));
        dataModels.add(new ArticleDataModel("ARTICLE XIV", "Education, Science and Technology, Arts, Culture and Sports"));
        dataModels.add(new ArticleDataModel("ARTICLE XV", "The Family"));

        dataModels.add(new ArticleDataModel("ARTICLE XVI", "General Provisions"));
        dataModels.add(new ArticleDataModel("ARTICLE XVII", "Amendments or Revisions"));
        dataModels.add(new ArticleDataModel("ARTICLE XVIII", "Transitory Provisions"));


        adapter= new CustomArticlesAdapter(dataModels,getApplicationContext());

        articlesListView.setAdapter(adapter);

        articlesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

               // ArticleDataModel dataModel= dataModels.get(position);

                    if(position == 0)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article1Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 1)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article2Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 2)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article03Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 3)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article04Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 4)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article05Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 5)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article06Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 6)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article07Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 7)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article08Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 8)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article09Activity.class);
                        startActivity(intent);
                    }
                   else if(position == 9)
                    {
                        Intent intent = new Intent(ArticlesActivity.this, Article10Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 10)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article11Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 11)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article12Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 12)
                    {
                        Intent intent = new Intent(ArticlesActivity.this, Article13Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 13)
                    {
                        Intent intent = new Intent(ArticlesActivity.this, Article14Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 14)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article15Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 15)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article16Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 16)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article17Activity.class);
                        startActivity(intent);
                    }
                    else if(position == 17)
                    {
                        Intent intent = new Intent(ArticlesActivity.this,Article18Activity.class);
                        startActivity(intent);
                    }



                //Snackbar.make(view, dataModel.getTitle()+"\n"+dataModel.getDescription(), Snackbar.LENGTH_LONG).setAction("No action", null).show();


            }
        });
        ///// Data Related//


    }


    @Override
    protected void onResume() {
        super.onResume();

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }

    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }


}
