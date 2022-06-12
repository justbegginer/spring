package org.musicClasses;

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
