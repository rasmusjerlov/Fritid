package Tredive;
import java.util.*;
public class RollAndKeepDice {
    private int numberOfDice = 6;

    public ArrayList<Random> rollDice(Player p) {
        Random random = new Random(6);
        System.out.println(random.toString());
        ArrayList<Random> diceRolled = new ArrayList<Random>();
        diceRolled.add(random);
        System.out.println(diceRolled);
        return diceRolled;
    }
}
