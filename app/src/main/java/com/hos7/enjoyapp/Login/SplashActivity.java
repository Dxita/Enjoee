package com.hos7.enjoyapp.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.hos7.enjoyapp.R;

public class SplashActivity extends AppCompatActivity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();


        Handler handler=new Handler();
        handler.postDelayed(this,3000);
    }

    @Override
    public void run() {

        Intent intent1 = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(intent1);

    }
}