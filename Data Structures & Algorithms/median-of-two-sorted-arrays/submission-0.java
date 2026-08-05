class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int a=0;
        int m=nums2.length;
        int b=0;
        int arr[]=new int[n+m];
        for(int i=0;i<arr.length;i++){
            if(a<n && b<m){
                if(nums1[a]<nums2[b]){
                    arr[i]=nums1[a++];
                }
                else{
                    arr[i]=nums2[b++];
                }
            }
            else if(a<n){
                arr[i]=nums1[a++];
            }
            else{
                arr[i]=nums2[b++];
            }
        }
        if((n+m)%2==1){
            return arr[(n+m)/2];
        }

        return (arr[(n+m)/2-1] + arr[(n+m)/2]) / 2.0;
    }
}
