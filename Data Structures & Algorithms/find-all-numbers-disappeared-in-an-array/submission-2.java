class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean bool[]=new boolean[nums.length+1];
      
        List<Integer>list=new ArrayList<>();
       
        for(int i:nums){
            bool[i]=true;
        }
       
        for(int i=1;i<=nums.length;i++){
            if(!bool[i]){
                list.add(i);
            }
        }return list;
    }
}