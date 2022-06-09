package org.musicClasses;

public class MusicPlayer {
    private Music music;
    private String name;
    private int duration;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        music.play();
    }

    public void setMusic(Music music) {
        this.music = music;
    }

}
