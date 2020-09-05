package day12.task5;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Требования поменялись - теперь у участника музыкальной группы есть не только имя,
 * но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
 * Необходимо реализовать класс MusicArtist и доработать класс MusicBand
 * (создать копию класса, с новым именем) таким образом,
 * чтобы участники были - объекты класса MusicArtist.
 * После этого, надо сделать то же самое, что и требовалось в 4 задании
 * - слить две группы и проверить состав групп после слияния.
 * Методы для слияния и для вывода участников в консоль необходимо тоже переработать,
 * чтобы они работали с объектами класса MusicArtist.
 */

public class Task5 {
    public static void main(String[] args) {

        List<MusicArtist> bandMembers1 = new ArrayList<>();
        bandMembers1.add(new MusicArtist("Bob", 21));
        bandMembers1.add(new MusicArtist("Tom", 22));
        bandMembers1.add(new MusicArtist("Sed", 23));
        bandMembers1.add(new MusicArtist("Ned", 37));

        MusicBand band1 = new MusicBand("Vary famous music band", 2012, bandMembers1);

        List<MusicArtist> bandMembers2 = new ArrayList<>();
        bandMembers2.add(new MusicArtist("Harry", 21));
        bandMembers2.add(new MusicArtist("Garry", 20));
        bandMembers2.add(new MusicArtist("Ozzy", 25));
        bandMembers2.add(new MusicArtist("Rozzy", 28));

        MusicBand band2 = new MusicBand("Super famous music band", 2002, bandMembers2);

        band1.printBandMembers();
        band2.printBandMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printBandMembers();
        band2.printBandMembers();
    }
}
