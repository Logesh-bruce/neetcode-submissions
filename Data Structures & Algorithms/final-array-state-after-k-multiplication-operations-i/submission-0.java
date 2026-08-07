class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
       
      while(k>0){
       int min=nums[0];
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
        }
        for(int i=0;i<nums.length;i++){
            if(min==nums[i]){
                nums[i]=min*m;
                break;
            }
        }
        k--;
      }
      return nums;  
    }
}