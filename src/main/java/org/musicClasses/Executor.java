package org.musicClasses;

import org.musicClasses.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("context.xml");
        MusicPlayer musicPlayer = beans.getBean("musicPlayerSetterBean", MusicPlayer.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getDuration());
        System.out.println();
        musicPlayer = beans.getBean("musicPlayerByListBean", MusicPlayer.class);
        musicPlayer.playMusic();
    }
}
