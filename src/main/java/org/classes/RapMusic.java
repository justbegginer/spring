package org.classes;

public class RapMusic implements Music {
    @Override
    public void play() {
        System.out.println("Saluki plays");
    }

    @Override
    public void stop() {
        System.out.println("Saluki stops");
    }
}
