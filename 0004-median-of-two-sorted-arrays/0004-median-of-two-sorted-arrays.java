class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double sum = 0;
        int n1 = nums1.length, n2 = nums2.length;
        int n = n1 + n2;
        int[] arr = new int[n];
        for(int i = 0 ; i < n1 ; i++)
            arr[i] = nums1[i];
        for(int i = n1 ; i < n ; i++)
            arr[i] = nums2[i-n1];
        Arrays.sort(arr);
        int a = n/2;
        if(n%2 == 0)
        {
            sum = arr[a-1] + arr[a];
            sum = sum/2;
        }
        else
        {
            sum = arr[a];
        }
        return sum;
    }
}