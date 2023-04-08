package Klodshans;

import java.util.*;

public class App {

    public static void main(String[] args) {
//        System.out.println("Indtast antal deltagere: ");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        for (int i = 0; i < n; i++) {
//            Deltager d = new Deltager(scanner.nextLine());
//            Storage.deltagere.add(d);
//            d.setId(i + 1);
//        }
//
//
//        System.out.println("Klodshans menu");
//        System.out.println("Vælg deltager:");
//        for (Deltager i : Storage.deltagere) {
//            System.out.print("ID " + i.getId() + ": ");
//            System.out.println(i.getName());
//        }
//
//        System.out.println("Indtast deltager id for at vælge");
//        int deltager = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Du valgte " + Storage.deltagere.get(deltager - 1).getName());
//        System.out.println("Hvad vil du tilføje? ");
//        System.out.println("1: Øl");
//        System.out.println("2: Snus");
//        System.out.println("3: Shots");
//        int x = scanner.nextInt();
//        if (x == 1) {
//            System.out.println("Hvor mange øl har " +
//                    Storage.deltagere.get(deltager - 1).getName() +
//                    " klodset?");
//            int y = scanner.nextInt();
//            Storage.deltagere.get(deltager - 1).setAntalØl(y);
//            System.out.println(Storage.deltagere.get(deltager - 1).getAntalØl());
//        } else if (x == 2) {
//            System.out.println("Hvor mange skiver har " +
//                    Storage.deltagere.get(deltager - 1).getName() +
//                    " klodset?");
//            int y = scanner.nextInt();
//            Storage.deltagere.get(deltager - 1).setAntalSnus(y);
//            System.out.println(Storage.deltagere.get(deltager - 1).getAntalSnus());
//        } else if (x == 3) {
//            System.out.println("Hvor mange shots har " +
//                    Storage.deltagere.get(deltager - 1).getName() +
//                    " klodset?");
//            int y = scanner.nextInt();
//            Storage.deltagere.get(deltager - 1).setAntalShots(y);
//            System.out.println(Storage.deltagere.get(deltager - 1).getAntalShots());
//
//        } else {
//
//        }


        GUI.launch(GUI.class);

    }
}
