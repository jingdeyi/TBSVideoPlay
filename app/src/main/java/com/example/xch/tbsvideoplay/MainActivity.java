package com.example.xch.tbsvideoplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_tbs_videoPlay;
    private String videoUrl="http://123.207.239.170/See%20You%20Again.mp4";//视频地址

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_tbs_videoPlay = findViewById(R.id.btn_tbs_videoPlay);
        btn_tbs_videoPlay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_tbs_videoPlay:
                VideoPlayActivity.actionStart(MainActivity.this,videoUrl);
                break;
            default:
                break;
        }
    }
}
