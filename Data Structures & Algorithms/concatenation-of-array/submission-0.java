class Solution {
    public int[] getConcatenation(int[] nums) {
        int []con=new int[nums.length*2];
        int len=nums.length;
        for(int i=0;i<nums.length;i++){
            con[i]=nums[i];
            con[len++]=nums[i];
        }return con;
    }
}