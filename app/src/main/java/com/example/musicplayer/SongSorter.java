package com.example.musicplayer;

import java.util.Comparator;

public class SongSorter implements Comparator<MusicFiles> {
    @Override
    public int compare(MusicFiles o1, MusicFiles o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
    }
}
