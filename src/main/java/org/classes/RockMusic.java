package org.classes;

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
