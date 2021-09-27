package com.example.musicplayer;

import java.util.Comparator;

public class AlbumSorter implements Comparator<MusicFiles> {
    @Override
    public int compare(MusicFiles o1, MusicFiles o2) {
        return o1.getAlbum().compareToIgnoreCase(o2.getAlbum());
    }
}
