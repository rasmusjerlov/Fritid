package Klodshans;


public class Øl extends Enhed{
    private int slurke;
    private int antalHele;

    public Øl(int slurke, int antalHele) {
        this.slurke = slurke;
        this.antalHele = antalHele;
    }

    public int getSlurke() {
        return slurke;
    }

    public void setSlurke(int slurke) {
        this.slurke = slurke;
    }

    public int getAntalHele() {
        return antalHele;
    }

    public void setAntalHele(int antalHele) {
        this.antalHele = antalHele;
    }

}
