package example_programs;
import java.util.Arrays;
public class NumberInverter {
        public static void invertBits(int[] num) {
            if(num == null || num.length<=1){
                return;
            }
            for (int i = 0; i < num.length; i++) {
                num[i] = (num[i] == 0) ? 1 : (num[i] == 1) ? 0 : num[i] ;
            }

        }

        public static void main(String[] args) {
            int[] num = {1, 4, 5, 0, 1, 0, 1, 0, 1};
            invertBits(num);
            System.out.println(Arrays.toString(num));

        }
    }
