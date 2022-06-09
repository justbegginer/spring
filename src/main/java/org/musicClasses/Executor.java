package org.musicClasses;

import org.musicClasses.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext("context.xml");
        MusicPlayer musicPlayer = beans.getBean("musicPlayerSetterBean", MusicPlayer.class);
        musicPlayer.playMusic();
    }
}
