package com.mobject.sonic.zoomableimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jsibbold.zoomage.ZoomageView;

public class MainActivity extends AppCompatActivity {

    private ZoomageView zoomageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zoomageView = (ZoomageView) findViewById(R.id.myZoomageView);
    }
}
