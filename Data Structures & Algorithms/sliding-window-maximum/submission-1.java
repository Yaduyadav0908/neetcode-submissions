class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[]=new int[nums.length -k +1];
        for(int i=0;i<=nums.length-k;i++){
            int max=nums[i];
            int j=i;
            while(j<i+k){
                max=Math.max(max,nums[j]);
                j++;
            }
            arr[i]=max;

        }
        return arr;
    }
}
