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

        //get the passing values of the selected {@link ListView} item
        Intent playSongIntent = getIntent();
        String song = playSongIntent.getExtras().getString("selectedSong");
        String artist = playSongIntent.getExtras().getString("selectedArtist");

        //find the TextViews in the Activity and update their values
        TextView songTextView = findViewById(R.id.playedSong);
        songTextView.setText(song);

        TextView songArtistView = findViewById(R.id.playedSongArtist);
        songArtistView.setText(artist);
    }

}
