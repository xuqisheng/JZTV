package com.hackday.andy.jztv;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by andy on 14/12/2016.
 */

public class PlayerActivity extends Activity {

    private VideoView videoView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);
        videoView = (VideoView) findViewById(R.id.videoView);
    }

    @Override
    protected void onStart() {
        super.onStart();
//        String httpLiveUrl = "http://hls4.l.cztv.com/channels/lantian/channel08/540p.m3u8?k=7f046088ba324630530907027c2c8da2&t=1481803345";
        String httpLiveUrl = "http://hls4.l.cztv.com/channels/lantian/channel08/540p.m3u8?k=eda0a66ac0c224c563ba6be41f606353&t=1481888296";
        videoView.setVideoURI(Uri.parse(httpLiveUrl));
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();
    }
}

