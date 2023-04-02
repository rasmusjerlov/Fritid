package Klodshans;

public class App {

    public static void main(String[] args) {
        GUI.launch(GUI.class);
        for (Deltager i : Storage.deltagere) {
            System.out.println(i.toString());
        }
    }
}
