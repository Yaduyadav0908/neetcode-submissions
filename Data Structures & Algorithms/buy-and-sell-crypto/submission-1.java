class Solution {
    public int maxProfit(int[] arr) {

        if (arr.length < 2)
            return 0;

        int buy = arr[0];
        int max = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[j] < buy) {
                buy = arr[j];
            } else {
                max = Math.max(max, arr[j] - buy);
            }
        }

        return max;
    }
}