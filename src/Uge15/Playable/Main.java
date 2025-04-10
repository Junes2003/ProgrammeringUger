package Uge15.Playable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Playable Drums = new Drums();
        Playable Guitar = new Guitar();
        Playable Trumpet = new Trumpet();

        List<Playable> instruments = new ArrayList<>();
        instruments.add(Guitar);
        instruments.add(Trumpet);
        instruments.add(Drums);

        for (Playable instrument : instruments) {
            instrument.playSound();
        }
    }
}
