package bba;

public class Arrays {
    public static void ascendingArray(int[] num){
        java.util.Arrays.sort(num);
    }

    public static void main(String[] args) {
        int[] num = {2,4,1,6,4,2,1};
        ascendingArray(num);
        System.out.println(java.util.Arrays.toString(num));

    }
}
