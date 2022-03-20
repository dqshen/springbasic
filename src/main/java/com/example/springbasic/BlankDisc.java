package com.example.springbasic;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void play() {
        log.info("Playing" + title + " by " + artist);
        for (String track : tracks) {
            log.info("-Track: " + track);
        }
    }

    @Override
    public void playTrack(int trackNumber) {
        log.info("Playing" + title + " by " + artist);
        if (trackNumber < tracks.size())
            log.info("-Track: " + tracks.get(trackNumber));
    }
}
