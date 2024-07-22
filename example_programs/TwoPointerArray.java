package example_programs;

import java.util.Arrays;

public class TwoPointerArray {

    static void moveElementToEnd(int[] num, int target){
        if(num==null || num.length<=1){
            return;
        }
        int left=0;
        int right =num.length-1;
        int temp;
        for(int i=0;i<=num.length;i++){
            while(left<=right){
                if(num[left] == target) {
                    temp = num[left];
                    num[left] = num[right];
                    num[right] =temp;
                    right--;

                }
                else {
                    left++;
                }
            }

            }
        }


    public static void main(String[] args) {
        int[] num ={2,5,7,2,8,5,4,3,2};
        int target =2;
        System.out.println("Before :- "+Arrays.toString(num));

        moveElementToEnd(num,target);
        System.out.println("After :- "+Arrays.toString(num));

    }
    }

