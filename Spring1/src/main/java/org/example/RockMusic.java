package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockMusic")
public class RockMusic implements Music{
    private List<String> rockMusic = new ArrayList();
    {
        rockMusic.add("Nirvana Smells Like Teen Spirit");
        rockMusic.add("Rammstein Du hast");
        rockMusic.add("Linkin Park In the end");
    }

    public List<String> getSong() {
        return rockMusic;
    }
}