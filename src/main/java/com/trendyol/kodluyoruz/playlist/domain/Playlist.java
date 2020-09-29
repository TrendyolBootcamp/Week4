package com.trendyol.kodluyoruz.playlist.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Playlist {
    private String userId;
    private int followersCount;
    private List<Track> tracks;
    private int trackCount;

    public Playlist(String userId) {
        this.userId = userId;
        this.followersCount = 0;
        this.tracks = new ArrayList<>();
        this.trackCount = 0;
    }

    public void addTrack(Track track) {
        this.tracks.add(track);
        this.trackCount++;
    }

    public void removeTrack(Track track) {
        if (this.tracks.remove(track)) {
            this.trackCount--;
        } else throw new IllegalArgumentException("Track not exists in playlist.");
    }

    public void followPlaylist() {
        this.followersCount++;
    }
}
