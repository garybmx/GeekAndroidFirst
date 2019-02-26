package com.example.geekandroidfirst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView cityText;
    private TextView dateText;
    private LinearLayout dampBlock;
    private LinearLayout windBlock;
    private TextView windValueText;
    private TextView windCourseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        cityText = (TextView) findViewById(R.id.city_text);
        dateText = (TextView) findViewById(R.id.date_text);
        dampBlock = (LinearLayout) findViewById(R.id.damp_block);
        windBlock = (LinearLayout) findViewById(R.id.wind_block);
        windValueText = (TextView) findViewById(R.id.wind_value_text);
        windCourseText = (TextView) findViewById(R.id.wind_course_text);


        String cityName = getIntent().getExtras().getString("CITY_NAME");
        cityText.setText(cityName);
        if(getIntent().hasExtra("IS_DATE")) dateText.setVisibility(View.VISIBLE);
        if(getIntent().hasExtra("IS_DAMP")) dampBlock.setVisibility(View.VISIBLE);

        if (!getIntent().hasExtra("IS_WIND_VALUE") && !getIntent().hasExtra("IS_WIND_COURSE")){
            windBlock.setVisibility(View.GONE);
        }
        else{
            if(getIntent().hasExtra("IS_WIND_VALUE")) windValueText.setVisibility(View.VISIBLE);
            if(getIntent().hasExtra("IS_WIND_COURSE")) windCourseText.setVisibility(View.VISIBLE);
        }


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("START", "app start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RESUME", "app resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("PAUSE", "app pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("STOP", "app stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DESTROY", "app destroy");
    }


}
