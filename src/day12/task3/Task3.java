package day12.task3;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 3. Создать класс Музыкальная Группа (англ. MusicBand)
 * // с полями name и year (название музыкальной группы и год основания).
 * // Создать 10 или более экземпляров класса MusicBand , добавить их в список
 * // (выбирайте такие музыкальные группы, которые были созданы как до 2000 года,
 * // так и после, жанр не важен). Перемешать список. Создать второй список,
 * // в который скопировать группы из первого списка, основанные после 2000 года. Вывести в консоль оба списка.
 */
public class Task3 {
    public static void main(String[] args) {

        ArrayList<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(new MusicBand("Scorpions", 1965));
        musicBands.add(new MusicBand("Nirvana", 1987));
        musicBands.add(new MusicBand("Twenty one pilots", 2009));
        musicBands.add(new MusicBand("Bring me the horizon", 2004));
        musicBands.add(new MusicBand("The devil wears Prada", 2005));
        musicBands.add(new MusicBand("Falling in Reverse", 2008));
        musicBands.add(new MusicBand("Enter Shikari", 2003));
        musicBands.add(new MusicBand("Röyksopp", 1998));
        musicBands.add(new MusicBand("Dead Silence Hides My Cries", 2009));
        musicBands.add(new MusicBand("Main-de-gloire", 2007));

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        ArrayList<MusicBand> musicBands2 = new ArrayList<>();

        for (MusicBand s : musicBands) {
            if (s.getYears() > 2000) {
                musicBands2.add(s);
            }
        }
        System.out.println(musicBands2);
    }
}
