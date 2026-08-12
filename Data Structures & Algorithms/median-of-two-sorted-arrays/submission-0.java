class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int[] merged=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                merged[k]=nums1[i];
                i++;
            }else{
                merged[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            merged[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            merged[k]=nums2[j];
            j++;
            k++;
        }
        int total=m+n;
        if(total%2!=0) return merged[total/2];
        else{
            int mid1=total/2;
            int mid2=mid1-1;
            return (merged[mid1]+merged[mid2])/2.0;
        }
    }
}
