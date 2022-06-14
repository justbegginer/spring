package org.musicClasses;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
