package com.example.paschalisbimpisidis.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the button that navigates to the song library
        Button browse = findViewById(R.id.browse);

        // Set a click listener on that View
        browse.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent browseIntent = new Intent(MainActivity.this, SongLibrary.class);

                // Start the new activity
                startActivity(browseIntent);
            }
        });


    }

}