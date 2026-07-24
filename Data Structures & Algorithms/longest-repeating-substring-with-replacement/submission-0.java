class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int max=0;
        int ans=0;


        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            max=Math.max(max,map.get(ch));
            while((i-l+1)-max>k){
                char lCh = s.charAt(l);
                map.put(lCh, map.get(lCh) - 1);
                l++;
            }
            ans=Math.max(ans,(i-l+1));
        }
        return ans;

    }
}
