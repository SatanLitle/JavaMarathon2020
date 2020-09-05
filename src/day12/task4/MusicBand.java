package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int years;
    private List<String> bandMember;

    public MusicBand(String name, int years, List<String> bandMember) {
        this.name = name;
        this.years = years;
        this.bandMember = bandMember;
    }

    @Override
    public String toString() {
        return " " + name + " " + years;
    }

    public int getYears() {
        return years;
    }

    public List<String> getBandMember() {
        return bandMember;
    }

    public void setBandMember(List<String> bandMember) {
        this.bandMember = bandMember;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (String members : a.getBandMember())
            b.getBandMember().add(members);
        a.getBandMember().clear();
    }

    public void printBandMembers() {
        System.out.println(this.bandMember);
    }
}
