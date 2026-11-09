package bites.examples;

import javax.print.attribute.HashDocAttributeSet;
import java.util.HashMap;

public class RockPaperScissors {
    static HashMap<String, HashMap<String, String>> rules = new HashMap<String, HashMap<String, String>>();

    public static void main(String[] args){
        HashMap<String, String> rockOutcomes = new HashMap<String, String>();
        rockOutcomes.put("rock", "draw");
        rockOutcomes.put("scissors", "player 1 wins");
        rockOutcomes.put("paper", "player 2 wins");

        HashMap<String, String> paperOutcomes = new HashMap<String, String>();
        paperOutcomes.put("paper", "draw");
        paperOutcomes.put("rock", "player 1 wins");
        paperOutcomes.put("scissors", "player 2 wins");

        HashMap<String, String> scissorOutcomes = new HashMap<String, String>();
        scissorOutcomes.put("scissors", "draw");
        scissorOutcomes.put("paper", "player 1 wins");
        scissorOutcomes.put("rock", "player 2 wins");

        rules.put("rock", rockOutcomes);
        rules.put("paper", paperOutcomes);
        rules.put("scissors", scissorOutcomes);

        System.out.println(RockPaperScissors.play("rock","paper"));
        System.out.println(RockPaperScissors.play("paper", "paper"));
        System.out.println(RockPaperScissors.play("scissors", "paper"));
    }

    public static String play(String playerOne, String playerTwo) {
        return rules.get(playerOne).get(playerTwo);
    }
}
