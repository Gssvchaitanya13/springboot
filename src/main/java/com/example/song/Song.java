// Write your code here
package com.example.song;

public class Song {
    private int songId;
    private String songName;
    private String lyricist;
    private String singer;
    private String musicDirector;

    public Song(int songId, String songName, String lyricist, String singer, String musicDirector) {
        this.songId = songId;
        this.songName = songName;
        this.lyricist = lyricist;
        this.singer = singer;
        this.musicDirector = musicDirector;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongLyricist() {
        return lyricist;
    }

    public void setSongLyricist(String lyricist) {
        this.lyricist = lyricist;
    }

    public String getSongSinger() {
        return singer;
    }

    public void setSongSinger(String singer) {
        this.singer = singer;
    }

    public String getSongMusicDirector() {
        return musicDirector;
    }

    public void setSongMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }

}