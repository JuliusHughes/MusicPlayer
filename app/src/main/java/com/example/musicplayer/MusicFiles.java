package com.example.musicplayer;

public class MusicFiles {

    private String path;
    private String title;
    private String artist;
    private String album;
    private String duration;
    private String id;
    private String track;
    private String album_artist;

    public MusicFiles(String path, String title, String artist, String album, String duration, String id, String track, String album_artist) {
        this.path = path;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.id = id;
        this.track = track;
        this.album_artist = album_artist;
    }

    public MusicFiles()
    {

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrack() { return track; }

    public void setTrack(String track) { this.track = track; }

    public String getAlbum_artist() { return album_artist; }

    public void setAlbum_artist(String album_artist) { this.album_artist = album_artist; }
}
