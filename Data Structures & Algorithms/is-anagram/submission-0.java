class Solution {
    public boolean isAnagram(String s, String t) {
           int arr[]=new int[26];
           for(int a:s.toCharArray()){
            arr[a-'a']++;
           }
           for(int a:t.toCharArray()){
            arr[a-'a']--;
           }
           for(int i=1;i<arr.length;i++){
            if(arr[i]!=0||arr[i]>0) return false;
           }return true;
    }
}
