class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i:nums){
            if(!list.contains(i)){
                list.add(i);
            }
        }int j=0;
        for(int i:list){
            nums[j++]=i;
        }return j;
}
}