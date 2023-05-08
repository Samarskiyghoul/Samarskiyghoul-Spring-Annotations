package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classicMusic")
public class ClassicMusic  implements Music{
    List<String> classicMusic = new ArrayList();
    {
        classicMusic.add("Бетховен К Элизе");
        classicMusic.add("Моцарт Реквием");
        classicMusic.add("Чайковский Славянский марш");
    }

    public List<String> getSong() {
        return classicMusic;
    }
}