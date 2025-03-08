package arrays;

public class MaXSubArray {

        public static void main(String args[]){
            int[] nums={-2,1,-3,4,-1,2,1,-5,4};
            MaXSubArray s=new MaXSubArray();
            int result=s.maxSubArray(nums);
            System.out.println(result);
        }
        public int maxSubArray(int[] nums) {
            int curSum=0;
            int maxSum=nums[0];
            for(int i=0; i<nums.length; i++){
                if(curSum<0){
                    curSum=0;
                }
                curSum=curSum+nums[i];
                maxSum=Math.max(curSum,maxSum);
            }
            return maxSum;

        }
    }

