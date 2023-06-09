package Klodshans;

import java.util.*;
public class Deltager {
    private String name;
    private int antalØl;
    private int antalShots;
    private int antalSnus;
    private int antalPenge;
    private int id = 1;

    public Deltager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAntalØl() {
        return antalØl;
    }

    public void setAntalØl(int antalØl) {
        this.antalØl = antalØl;
    }

    public int getAntalShots() {
        return antalShots;
    }

    public void setAntalShots(int antalShots) {
        this.antalShots = antalShots;
    }

    public int getAntalSnus() {
        return antalSnus;
    }

    public void setAntalSnus(int antalSnus) {
        this.antalSnus = antalSnus;
    }

    public int getAntalPenge() {
        return antalPenge;
    }

    public void setAntalPenge(int antalPenge) {
        this.antalPenge = antalPenge;
    }

    @Override
    public String toString() {
        return "Deltager: " + name +
                " beers: " + antalØl +
                " skiver: " + antalSnus +
                " shots: " + antalShots +
                " penge: " + antalPenge + "\n";
    }
}
