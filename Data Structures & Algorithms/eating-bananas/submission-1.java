class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int p:piles){
            high=Math.max(high,p);
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            int ach=0;
            for(int p:piles){
                ach+=(p+mid-1)/mid;
            }
            if(ach<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
