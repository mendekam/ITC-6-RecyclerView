package com.example.tugasrecyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fragment recycleview
        FragmentData fragmentData = new FragmentData();
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentByTag(FragmentData.class.getSimpleName());
        fragmentManager.beginTransaction().add(R.id.mainplace, fragmentData, FragmentData.class.getSimpleName()).commit();

    }


}