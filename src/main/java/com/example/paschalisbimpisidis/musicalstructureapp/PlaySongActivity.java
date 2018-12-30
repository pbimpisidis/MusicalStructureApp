package com.example.paschalisbimpisidis.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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

        // Find the TextView that navigates to the song library
        TextView back = findViewById(R.id.back);

        // Set a click listener on that View
        back.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the TextView is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongLibrary}
                Intent backIntent = new Intent(PlaySongActivity.this, SongLibrary.class);

                // Start the new activity
                startActivity(backIntent);
            }
        });

        // Find the Image that plays the song
        ImageView playImage = findViewById(R.id.play_image);

        // Set a click listener on that View
        playImage.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the ImageView is clicked on.
            @Override
            public void onClick(View view) {
                String playMessage = "Start song";
                Toast.makeText(PlaySongActivity.this, playMessage, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
