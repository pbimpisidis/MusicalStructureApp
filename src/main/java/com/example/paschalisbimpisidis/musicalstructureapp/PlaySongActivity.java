package com.example.paschalisbimpisidis.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlaySongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_song);

        Intent intent = getIntent();
        String song = intent.getExtras().getString("selectedSong");
        String artist = intent.getExtras().getString("selectedArtist");

        TextView songTextView = findViewById(R.id.playedSong);
        songTextView.setText(song);

        TextView songArtistView = findViewById(R.id.playedSongArtist);
        songArtistView.setText(artist);
    }


}
