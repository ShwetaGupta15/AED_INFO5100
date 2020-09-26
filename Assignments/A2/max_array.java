import java.util.Arrays; 

public class max_array{

    public static int maxSubArray(int[] nums) {
        //write your code here
	int prev = nums[0],res = nums[0];
        for(int i=1;i<nums.length;i++){
            if(prev>0)  prev=prev+nums[i];
            else    prev = nums[i];
            if(prev>res) res=prev;
        }
        //System.out.println(res);
	return res;
    }

    public static void main(String[] args) {
        //write your code here
	int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
	//int result = maxSubArray(nums);
	System.out.println(maxSubArray(nums)); 
    }
}