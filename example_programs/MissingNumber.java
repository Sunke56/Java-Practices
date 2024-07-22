package example_programs;

public class MissingNumber {

    public static int missingNumber(int[] nums){
        int n = nums.length + 1;
        int ActualSum = n *(n+1)/2;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
        }
        return  ActualSum-sum;
    }

    public static void main(String[] args) {
        int[] num = {1,3,4,5,6};
        System.out.println(missingNumber(num));
    }
}
