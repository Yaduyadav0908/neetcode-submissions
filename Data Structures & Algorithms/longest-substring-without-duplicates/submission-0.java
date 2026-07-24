class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        int i=0;
        int max=0;
        int rem=0;
        while(i<s.length()){
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
                max=Math.max(max,i-rem+1);
                i++;
            }
            else{
                st.remove(s.charAt(rem));
                rem++;
            }
        }
        return max;
    }
}
