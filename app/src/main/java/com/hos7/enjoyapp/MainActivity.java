package com.hos7.enjoyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hos7.enjoyapp.Fragment.AlertFragment;
import com.hos7.enjoyapp.Fragment.ContactFragment;
import com.hos7.enjoyapp.Fragment.GroupFragment;
import com.hos7.enjoyapp.Fragment.HistoryFragment;
import com.hos7.enjoyapp.Fragment.TempFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        BottomNavigationView navView = findViewById(R.id.navigationView);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setItemIconTintList(null);

        Fragment fragment=new ContactFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,fragment);
        ft.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_item1:
                    Fragment fragment=new HistoryFragment();
                    FragmentManager fm=getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.frame,fragment);
                    ft.commit();
                    return true;
                case R.id.action_item2:
                    Fragment fragment1=new GroupFragment();
                    FragmentManager fm1=getSupportFragmentManager();
                    FragmentTransaction ft1=fm1.beginTransaction();
                    ft1.replace(R.id.frame,fragment1);
                    ft1.commit();
                    return true;
                case R.id.action_item3:
                    Fragment fragment2=new ContactFragment();
                    FragmentManager fm2=getSupportFragmentManager();
                    FragmentTransaction ft2=fm2.beginTransaction();
                    ft2.replace(R.id.frame,fragment2);
                    ft2.commit();
                    return true;
                case R.id.action_item4:
                    Fragment fragment3=new TempFragment();
                    FragmentManager fm3=getSupportFragmentManager();
                    FragmentTransaction ft3=fm3.beginTransaction();
                    ft3.replace(R.id.frame,fragment3);
                    ft3.commit();
                    return true;

                case R.id.action_item5:
                    Fragment fragment5=new AlertFragment();
                    FragmentManager fm5=getSupportFragmentManager();
                    FragmentTransaction ft5=fm5.beginTransaction();
                    ft5.replace(R.id.frame,fragment5);
                    ft5.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    public void onBackPressed() {
        BottomNavigationView mBottomNavigationView = findViewById(R.id.navigationView);
        if (mBottomNavigationView.getSelectedItemId() == R.id.action_item3)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                finishAffinity();
            }
        }
        else
        {
            mBottomNavigationView.setSelectedItemId(R.id.action_item3);
        }
    }
}