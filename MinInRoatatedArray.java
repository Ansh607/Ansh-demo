
package arrays;
public class MinInRoatatedArray {

        public static void main(String args[]){
            int[] nums={3, 4, 5, 1, 2};
            MinInRoatatedArray s=new MinInRoatatedArray();
            int result=s.findMin(nums);
            System.out.println(result);
        }
        public int findMin(int[] nums) {
            int left=0;
            int right=nums.length-1;
            int ans=nums[0];
            if(nums.length==1){
                return nums[0];

            }
            while(left<=right){
                if(nums[left] < nums[right]){
                    ans=Math.min(ans,nums[left]);
                }
                int mid=(left+right)/2;

                ans=Math.min(ans, nums[mid]);
                if(nums[left]<=nums[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            return ans;

        }
    }

