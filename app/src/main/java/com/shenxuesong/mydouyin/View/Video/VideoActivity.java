package com.shenxuesong.mydouyin.View.Video;

import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.MediaController;
import android.widget.VideoView;

import com.dl7.player.media.IjkPlayerView;
import com.shenxuesong.mydouyin.R;

public class VideoActivity extends AppCompatActivity {
private VideoView vv_video1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        String url = getIntent().getStringExtra("url");
        Log.i("URL",url);
        vv_video1 =  findViewById(R.id.vv_video); ////获取VideoView的id
       Uri mUri = Uri.parse(url);

        vv_video1.setVideoURI(mUri);

        //实例化媒体控制器
        MediaController mediaController=new MediaController(this);
        mediaController.setMediaPlayer(vv_video1);
        vv_video1.setMediaController(mediaController);
        vv_video1.start();
    }

}
