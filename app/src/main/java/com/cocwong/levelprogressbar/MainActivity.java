package com.cocwong.levelprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LevelBar levelBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        levelBar = findViewById(R.id.level_bar);
        levelBar.setLevels(new String[]{"游侠","骑士","子爵","伯爵","公爵","国王","皇帝"});
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_7).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:
                levelBar.setLevel(1);
                break;
            case R.id.btn_2:
                levelBar.setLevel(2);
                break;
            case R.id.btn_3:
                levelBar.setLevel(3);
                break;
            case R.id.btn_4:
                levelBar.setLevel(4);
                break;
            case R.id.btn_5:
                levelBar.setLevel(5);
                break;
            case R.id.btn_6:
                levelBar.setLevel(6);
                break;
            case R.id.btn_7:
                levelBar.setLevel(7);
                break;
        }
    }
}
