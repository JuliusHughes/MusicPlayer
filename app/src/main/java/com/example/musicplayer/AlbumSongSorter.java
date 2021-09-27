package com.example.musicplayer;

import java.util.Comparator;

public class AlbumSongSorter implements Comparator<MusicFiles> {
    @Override
    public int compare(MusicFiles o1, MusicFiles o2) {
        return o1.getTrack().compareToIgnoreCase(o2.getTrack());
    }
}
