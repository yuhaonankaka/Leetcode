package two_Sum;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                int [] ret = new int[2];
                ret[0]=i;
                ret[1]=j;
                return ret;
            }
        }
    }
    return null;
}
}
