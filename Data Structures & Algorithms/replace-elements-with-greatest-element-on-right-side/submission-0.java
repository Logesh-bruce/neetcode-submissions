class Solution {
    public int[] replaceElements(int[] arr) {
       int j=0;
       while(j<arr.length){
        int max=0;
        for(int i=j+1;i<arr.length;i++){
            if(max<arr[i]) max=arr[i];
        }
        arr[j++]=max;
        
       }arr[arr.length-1]=-1;
       return arr; 
    }
}