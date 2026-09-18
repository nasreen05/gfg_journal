class Solution {
    public double findMedian(int[] arr) {

        // Sort the array
        Arrays.sort(arr);

        int n = arr.length;

        // If number of elements is odd
        if (n % 2 != 0) {
            return arr[n / 2];
        }

        // If number of elements is even
        return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
    }
}