class Solution {
    public int maxArea(int[] arr) {
        int max=0;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int h=Math.min(arr[i],arr[j]);
            max=Math.max(max,h*(j-i));
            if(arr[i]<arr[j]) i++;
            else{
                j--;
            }


        }
        return max;
    }
}
