class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int c=0;
        int r=s.length()-1;
        StringBuilder sb=new StringBuilder(s).reverse();
        String a=sb.toString();
        if(a.equals(s))return true;
        else{
        while(l<r){
         if(s.charAt(l)!=s.charAt(r)){
            return valid(s,l+1,r) || valid(s,l,r-1);
         }
         l++;
         r--;

        }
        }return false;
        
    }
    private boolean valid(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }return true;
    }
}