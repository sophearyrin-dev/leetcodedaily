// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
public class FindPivotIndex724 {
    public static int pivotIndex(int[] nums) {

        int lefSum=0, rightSum =0;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }

        for(int i=0; i<nums.length; i++){
            rightSum = sum - nums[i] - lefSum;
            if(lefSum == rightSum) return i;
            lefSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FindPivotIndex724.pivotIndex(new int[]{1,7,3,6,5,6})); //3
        System.out.println(FindPivotIndex724.pivotIndex(new int[]{1,2,3})); //-1

    }
}
