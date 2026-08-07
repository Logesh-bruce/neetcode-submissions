class Solution {
    public int scoreOfString(String s) {
        int a=0;
       for(int i=1;i<s.length();i++){
        int sa=Math.abs(s.charAt(i)-s.charAt(i-1));
        a+=sa;
       }return a;
    }
}