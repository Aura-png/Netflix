package pack;

import pack.FilmAndSerial;

import java.util.ArrayList;

public class User {
    private String nume;
    private ArrayList<FilmAndSerial> myList =new ArrayList<>();
    private ArrayList<FilmAndSerial> vazute =new ArrayList<>();

    public User(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

}
