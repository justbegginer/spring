package org.musicClasses;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@ComponentScan("org.musicClasses")
@PropertySource("classpath:musicClasses.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic(){
        return new ClassicMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public RapMusic rapMusic(){
        return new RapMusic();
    }
    @Bean
    public MusicPlayer singleMusicPlayer(){
        return new MusicPlayer(classicMusic());
    }
    @Bean
    public MusicPlayer listMusicPlayer(){
        return new MusicPlayer(List.of(classicMusic(), rockMusic(), rapMusic()));
    }
}
