class Solution {
    public int minimumRecolors(String blocks, int k) {
        int a=0;
        
        int b=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
            a++;
            }else{
                b++;
            }
        }
        int value=0;
        int min=a;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(i-k)=='W'){
                a--;
            }else{
                b--;
                }
        if(blocks.charAt(i)=='W'){
                
                a++;
            }else{
                b++;
            }
           
            min=Math.min(min,a);
        }return min;
    }
}