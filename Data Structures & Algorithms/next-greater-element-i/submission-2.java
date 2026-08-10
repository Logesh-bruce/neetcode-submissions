class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int value;
        int arr[]=new int[nums1.length];
         for(int i=0;i<nums1.length;i++){
             value=-1;
            for(int j=nums2.length-1;j>=0;j--){
               
               if(nums1[i]<nums2[j]){
                value=nums2[j];
              
               }else if(nums2[j]==nums1[i]) break;
            }arr[i]=value;
         }return arr;
    }
}