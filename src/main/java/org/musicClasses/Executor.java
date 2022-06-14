package org.musicClasses;

import org.musicClasses.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext beans = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = beans.getBean("singleMusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getDuration());
        System.out.println();
        musicPlayer = beans.getBean("listMusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();
    }
}
