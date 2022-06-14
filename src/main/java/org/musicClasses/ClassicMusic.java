package org.musicClasses;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ClassicMusic implements Music{
    @Override
    public void play() {
        System.out.println("Flight of the bumblebee plays");
    }

    @Override
    public void stop() {
        System.out.println("Flight of the bumblebee stops");
    }
}
