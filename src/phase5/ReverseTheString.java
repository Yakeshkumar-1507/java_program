package phase5;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Scanner;

public class ReverseTheString {

    /**
     * Input  - shruthi
     * op - ihturhs
     */

    static public String reverseString(String str) {
        char[] ch = str.toCharArray();
        String output = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            output = output + ch[i];
        }
        return output;
    }

    static public HashMap<Character, Integer> countOfCharacters(String str) {
        try {
            HashMap<Character, Integer> map = new HashMap<>();
            char[] ch = str.toCharArray();
            for (char c : ch) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
    return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(reverseString(str));
        System.out.println();
        System.out.println("Count of Occurrence : " + countOfCharacters(str).toString());
    }
}
