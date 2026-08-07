class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
                k++;
            }
        }
        int c=nums.length-k;
        if(c!=0)
           for(int i=0;i<c;i++){
            list.add(0);
           }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
       }
}
    
