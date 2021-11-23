package pack;

import pack.Episod;

import java.util.ArrayList;

public class Sezon {
    private int numarSezon;
    private int numarEpisoade;
    private ArrayList<Episod> listaEpisoade;

    public Sezon(int numarSezon, int numarEpisoade) {
        this.numarSezon = numarSezon;
        this.numarEpisoade = numarEpisoade;
        this.listaEpisoade=new ArrayList<>(numarEpisoade);
    }
}
