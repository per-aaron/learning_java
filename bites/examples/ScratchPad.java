package bites.examples;

import java.util.Arrays;
import java.util.HashMap;

public class ScratchPad {

    public static void main(String[] args){
        HashMap<String, Integer[]> scores = new HashMap<String, Integer[]>();

        scores.put("Global Issues", new Integer[]{1,2,0,2});
        scores.put("Team 3", new Integer[]{3,1,0,0});
        scores.put("Diminishing Returns", new Integer[]{3,2,1,2});

        System.out.println(Arrays.toString(scores.get("Global Issues")));

    }
}
