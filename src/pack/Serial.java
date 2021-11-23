package pack;

import pack.Actor;
import pack.FilmAndSerial;

import java.util.ArrayList;

public class Serial extends FilmAndSerial {

    private int numarSezoane;
    private ArrayList<Sezon> sezoane;

    public Serial(String nume, String gen, String descriere, ArrayList<Actor> actori, String limitaDeVarsta, int anAparitie, int numarSezoane) {
        super(nume, gen, descriere, actori, limitaDeVarsta, anAparitie);
        this.numarSezoane = numarSezoane;
        this.sezoane=new ArrayList<>(numarSezoane);
    }

    public int getNumarSezoane() {
        return numarSezoane;
    }

    public void setNumarSezoane(int numarSezoane) {
        this.numarSezoane = numarSezoane;
    }

    public ArrayList<Sezon> getSezoane() {
        return sezoane;
    }

    public void setSezoane(ArrayList<Sezon> sezoane) {
        this.sezoane = sezoane;
    }
}
