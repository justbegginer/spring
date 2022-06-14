package org.musicClasses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class MusicPlayer {
    private ArrayList<Music> music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.duration}")
    private int duration;

    public MusicPlayer(Music music) {
        this.music = new ArrayList<>();
        this.music.add(music);
    }

    public MusicPlayer(List<Music> arrayList){
        this.music = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            music.add(arrayList.get(i));
        }
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        for (int i = 0; i < music.size(); i++) {
            music.get(i).play();
        }
    }

    public void stopMusic() {
        for (int i = 0; i < music.size(); i++) {
            music.get(i).stop();
        }
    }

    public void setMusic(Music music) {
        this.music = new ArrayList<>();

        this.music.add(music);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
