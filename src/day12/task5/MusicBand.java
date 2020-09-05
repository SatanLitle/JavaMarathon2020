package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int years;
    private List<MusicArtist> bandMember;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public List<MusicArtist> getBandMember() {
        return bandMember;
    }

    public void setBandMember(List<MusicArtist> bandMember) {
        this.bandMember = bandMember;
    }


    public MusicBand(String name, int years, List<MusicArtist> bandMember) {
        this.name = name;
        this.years = years;
        this.bandMember = bandMember;
    }


    public static void transferMembers(MusicBand a, MusicBand b) {
        for (MusicArtist c : a.getBandMember())
            b.getBandMember().add(c);
        a.getBandMember().clear();
    }

    public void printBandMembers() {
        System.out.println(this.bandMember);
    }
}

