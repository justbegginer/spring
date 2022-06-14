package org.musicClasses;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RockMusic implements Music{

    @Override
    public void play() {
        System.out.println("AC/DC sounds");
    }

    @Override
    public void stop() {
        System.out.println("AC/DC stops");
    }
}
