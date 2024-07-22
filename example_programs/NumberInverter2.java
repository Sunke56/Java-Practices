package example_programs;

import java.util.Arrays;

public class NumberInverter2 {

    public static String inverterBits2(String str){

       StringBuilder sb = new StringBuilder();

       for(int i =0;i<str.length();i++){
           char currentChar = str.charAt(i);
           if(currentChar == '1'){
               sb.append('0');
           } else if (currentChar == '0') {
               sb.append('1');
           }
           else{
               sb.append(currentChar);
           }
       }
       return sb.toString();
    }

    public static void main(String[] args) {
        String str3 = "10102030211280" ;
        System.out.println("before Inverting "+ str3);

        System.out.println("After Inverting " + inverterBits2(str3));
    }


}
