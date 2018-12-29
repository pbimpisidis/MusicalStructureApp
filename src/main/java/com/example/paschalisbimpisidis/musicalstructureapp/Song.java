package com.example.paschalisbimpisidis.musicalstructureapp;

/**
 * {@link Song} represents a song
 * it contains the title and the artist
 */
public class Song {

    /**
     * Song title
     */
    private String mSongTitle;

    /**
     * Song artist
     */
    private String mArtist;

    /**
     * Constructor - Create a new Song object.
     *
     * @param songTitle is the title of song
     * @param artist    is the artist of the song
     */
    public Song(String songTitle, String artist) {
        mSongTitle = songTitle;
        mArtist = artist;
    }

    /**
     * Get the title of the song.
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the artist of the song.
     */
    public String getArtist() {
        return mArtist;
    }

}