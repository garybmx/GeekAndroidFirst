package com.example.geekandroidfirst;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    Logger logger;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logger = Logger.getLogger(MainActivity.class.getName());
        logger.setUseParentHandlers(false);

        try{
            Handler handler = new FileHandler("mainActivityLog%g.log", 10*1024, 5,true);
            handler.setLevel(Level.INFO);
            logger.addHandler(handler);

        } catch (IOException e) {
            e.printStackTrace();
        }

        logger.log(Level.INFO, "OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logger.log(Level.INFO, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logger.log(Level.INFO, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logger.log(Level.INFO, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logger.log(Level.INFO, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logger.log(Level.INFO, "onDestroy");
    }


}
