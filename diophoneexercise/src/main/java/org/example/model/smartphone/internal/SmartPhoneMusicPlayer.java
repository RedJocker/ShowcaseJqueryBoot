package org.example.model.smartphone.internal;

import org.example.model.MusicPlayer;

import java.util.function.Consumer;

public class SmartPhoneMusicPlayer implements MusicPlayer {

    String song = null;
    boolean isPlaying = false;

    public SmartPhoneMusicPlayer() {
    }

    @Override
    public void play() {
        ifSongLoadDo((song) -> {
            if (!isPlaying) {
                System.out.printf("playing song %s%n", song);
                this.isPlaying = true;
            } else {
                System.out.println("player already playing%n");
            }
        });
    }

    @Override
    public void pause() {
        ifSongLoadDo((song) -> {
            if (isPlaying) {
                System.out.printf("pausing song %s%n", song);
                this.isPlaying = false;
            } else {
                System.out.printf("unloading song %s%n", song);
                this.song = null;
            }
        });
    }

    @Override
    public void load(String song) {
        this.song = song;
        System.out.printf("loading song %s%n", this.song);
    }

    private void ifSongLoadDo(Consumer<String> action) {
        if (song == null) {
            System.out.println("no song loaded");
        } else {
            action.accept(song);
        }
    }
}