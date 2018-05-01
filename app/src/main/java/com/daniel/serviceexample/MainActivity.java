package com.daniel.serviceexample;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;

public class MainActivity extends Activity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSimpleService(View view) {
        startService(new Intent(getBaseContext(), MainActivity.class));
        MediaPlayer player = MediaPlayer.create(this, Settings.System.DEFAULT_NOTIFICATION_URI);
        player.setLooping(true);
        player.setVolume(100,100);
        player.start();
    }

    public void stopSimpleService(View view) {
        stopService(new Intent(getBaseContext(), MainActivity.class));
       }

}
