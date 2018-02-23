package com.shenxuesong.mydouyin.View;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

public class MyAPP extends Application {
        @Override  
        public void onCreate() {  
            super.onCreate();  
            Fresco.initialize(this);
        }  
    }  