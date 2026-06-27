class Solution {
    public boolean hasDuplicate(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])) {
                return true;
            }
            else{
                map.put(arr[i],1);
            }
        }
        return false;
    }
}