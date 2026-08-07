class Solution {
    public int maxDifference(String s) {
        int freq[]=new int[26];
        for(char a:s.toCharArray()){
            freq[a-'a']++;
        }int even=Integer.MAX_VALUE;
        int odd=Integer.MIN_VALUE;
        for(int i:freq){
            if(i%2==0&&i!=0){
                
                even=Math.min(even,i);
            }else if(i!=0){
                odd=Math.max(odd,i);
            }
        }return odd-even;
    }
}