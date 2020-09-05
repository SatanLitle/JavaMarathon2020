package day12.task3;

public class MusicBand {
    private String name;
    private int years;

    public MusicBand(String name, int years) {
        this.name = name;
        this.years = years;
    }

    @Override
    public String toString() {
        return " " + name + " " + years;
    }

    public int getYears() {
        return years;
    }
}
