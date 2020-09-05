package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Bob");
        members1.add("Ron");
        members1.add("Harry");

        MusicBand musicBand1 = new MusicBand("Famous band", 2018, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Ozzy");
        members2.add("Danny");
        members2.add("Mike");

        MusicBand musicBand2 = new MusicBand("Vary famous band", 2019, members2);

        musicBand1.printBandMembers();
        musicBand2.printBandMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printBandMembers();
        musicBand2.printBandMembers();

    }

}
