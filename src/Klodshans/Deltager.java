package Klodshans;

public class Deltager {
    private String name;
    private int antalØl;
    private int antalShots;
    private int antalSnus;
    private int antalPenge;

    public Deltager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
        return "Deltager{" +
                "name='" + name
                + "'}";
    }
}
