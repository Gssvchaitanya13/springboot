package com.example.song;
// Write your code here

import java.util.*;

import com.example.song.Song;

public interface SongRepository {
    ArrayList<Song> getSongs();

    Song getSongById(int songId);

    Song addSong(Song song);

    Song updateSong(int songId, Song song);

    void deleteSong(int songId);
}