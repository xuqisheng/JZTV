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
        String httpLiveUrl = "http://hls4.l.cztv.com/channels/lantian/channel08/360p.m3u8?k=8f774534a3a770091c717f68cde7e1b0&t=1481681346";
        videoView.setVideoURI(Uri.parse(httpLiveUrl));
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();
    }
}

