package example_programs;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static String getCharacterCount(String str) {
        if(str == ""){
            return "No String is available";
        }

        Map<Character, Integer> map1 = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {

            if (map1.containsKey(c)) {
                sb.append(c);
                sb.append(map1.get(c));
                map1.remove(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "AABRBTYTRGHFGHAB";
         String string =getCharacterCount(str1);
        System.out.println(string);
    }
}
