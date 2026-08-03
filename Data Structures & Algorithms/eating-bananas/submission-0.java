class Solution {
    public boolean canEat(int[] piles, int h, int s){
        int hr=0;
        for(int p:piles){
            hr+=(p+s-1)/s;
        }
        return hr<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int hi=0;
        for(int p:piles){
            hi=Math.max(hi,p);
        }
        
        while(l<=hi){
            int mid=l+(hi-l)/2;

            if(canEat(piles,h,mid)){
                hi=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}
