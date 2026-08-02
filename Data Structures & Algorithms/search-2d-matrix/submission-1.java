class Solution {
    public boolean searchMatrix(int[][] mt, int target) {
        int m=mt.length;
        int n=mt[0].length;

        int i=0;
        int j=m*n-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            
            int r=mid/n;
            int c=mid%n;

            if(mt[r][c]==target) return true;
            else if(mt[r][c]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }

        }
        return false;
    }
    
}
