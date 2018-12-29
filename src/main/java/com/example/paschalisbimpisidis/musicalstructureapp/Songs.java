package com.example.paschalisbimpisidis.musicalstructureapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Song> library = new ArrayList<>();
        library.add(new Song("Ain't No Sunshine", "Bill Withers"));
        library.add(new Song("Walk This Way", "Aerosmith"));
        library.add(new Song("More Than a Feeling", "Boston"));
        library.add(new Song("Superstition", "Stevie Wonder"));
        library.add(new Song("Black Magic Woman", "Santana"));
        library.add(new Song("Knocking on Heaven's Door", "Bob Dylan"));
        library.add(new Song("Dream On", "Aerosmith"));
        library.add(new Song("With or Without You", "U2"));
        library.add(new Song("Like a Prayer", "Madonna"));
        library.add(new Song("Livin' On a Prayer", "Bon Jovi"));
        library.add(new Song("Lovely Day", "Bill Withers"));
        library.add(new Song("Listen To Your Heart", "Roxette"));
        library.add(new Song("The Look", "Roxette"));
        library.add(new Song("Bad medicine", "Bon Jovi"));
        library.add(new Song("Sunday Bloody Sunday", "U2"));
        library.add(new Song("Beautiful Day", "U2"));
        library.add(new Song("Corazon Espinado", "Santana"));
        library.add(new Song("I'll be there", "The Jackson 5"));
        library.add(new Song("Hotel California", "Eagles"));
        library.add(new Song("Take It Easy", "Eagles"));
        library.add(new Song("Tom Sawyer", "Rush"));
        library.add(new Song("Working Man", "Rush"));
        library.add(new Song("Limelight", "Rush"));
        library.add(new Song("Black Velvet", "Alannah Myles"));
        library.add(new Song("One", "U2"));
        library.add(new Song("Bed of Roses", "Bon Jovi"));
        library.add(new Song("Call Me", "Blondie"));
        library.add(new Song("Gloria", "Laura Branigan"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, library);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
