class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int l=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int cur=num;
                int len=1;

                while(set.contains(cur+1)){
                    len++;
                    cur++;
                }
                l = Math.max(l, len);
            }
        }
        return l;

    }
}
