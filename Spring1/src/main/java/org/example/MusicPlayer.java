package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private RockMusic rockMusic;
    private ClassicMusic classicMusic;

    @Autowired
    public MusicPlayer( RockMusic rockMusic, ClassicMusic classicMusic) {
        this.rockMusic = rockMusic;
        this.classicMusic = classicMusic;
    }


    public void playMusic(MusicGenre genre){
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if (genre == MusicGenre.ROCK){
            System.out.println(rockMusic.getSong().get(randomNumber));
        }else {
            System.out.println(classicMusic.getSong().get(randomNumber));
        }
    }
}

