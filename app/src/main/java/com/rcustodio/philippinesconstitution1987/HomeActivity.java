package com.rcustodio.philippinesconstitution1987;

import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class HomeActivity extends Activity {

   // ListView HomeListView;
    CardView preambleButton,articelsButton,shareAppButton,rateAppButton;

    AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



       // HomeListView = findViewById(R.id.homeListView);
            preambleButton = findViewById(R.id.preambleBtn);
            articelsButton = findViewById(R.id.articlesBtn);
            shareAppButton = findViewById(R.id.articlesBtnShare);
            rateAppButton = findViewById(R.id.articlesBtnRate);

            preambleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent preambleIntent = new Intent(HomeActivity.this,PreambleActivity.class);
                    startActivity(preambleIntent);



                }
            });

        articelsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent preambleIntent = new Intent(HomeActivity.this,ArticlesActivity.class);
                startActivity(preambleIntent);



            }
        });

        shareAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = view.getContext();

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "https://play.google.com/store/apps/details?id="+context.getPackageName();
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share using"));


            }
        });

        rateAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("market://details?id="+"com.android.chrome")));
                }
                catch (ActivityNotFoundException e){

                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id="+getPackageName())));

                }


            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();


       // additemstolist();




    }

//    public void additemstolist(){
//
//
//        List<HashMap<String,String>> list = new ArrayList<>();
//
//        String[] mobileArray = {"Preamble","Articles"};
//
//
//        for(int i =0;i< mobileArray.length;i++){
//
//            HashMap<String,String> map = new HashMap<>();
//            map.put("Title",mobileArray[i]);
//
//            list.add(map);
//        }
//
//
//
//        //////////////////
//
//        //1. Custom layout
//        int layout = R.layout.home_custom_layout;
//        //2. View array
//        int[] views = {R.id.homecustomlistitemtv};
//        //3. Columns Strings
//        String[] cols = {"Title"};
//
//        ListAdapter adapter = new HomeCustomAdapter(this,list,layout,cols,views);
//        HomeListView.setAdapter(adapter);
//
//
//    }


}
