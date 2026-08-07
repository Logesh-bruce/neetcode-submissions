class Solution {
    public boolean canConstruct(String r, String m) {
        int freq[]=new int[26];
        
        for(char a:m.toCharArray()){
            freq[a-'a']++;
        }
        for(char a:r.toCharArray()){
           if(freq[a-'a']==0) return false;
           freq[a-'a']--;
        }return true;
       
    }
}