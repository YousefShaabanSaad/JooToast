package com.yousef.jootoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JooToast.setShortToast(this,"This is short Toast This is short Toast This is short Toast This is short Toast", JooToast.SUCCESS);

        JooToast.setLongToast(this,"This is long Toast", JooToast.FAIL);
    }
}