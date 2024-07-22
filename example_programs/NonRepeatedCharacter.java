package example_programs;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatedCharacter {

    public static char getNonRepeatChar(String str){
        Map<Character, Integer> map1 = new HashMap<>();

        for(char ch : str.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        for(char c : str.toCharArray()){
            if(map1.get(c) == 1){
                return c;
            }

        }
        throw new IllegalArgumentException("No Character is available");
    }

    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(getNonRepeatChar(str));
    }
}
