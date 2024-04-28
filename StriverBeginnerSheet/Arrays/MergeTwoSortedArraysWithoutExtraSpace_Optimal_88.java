public class MergeTwoSortedArraysWithoutExtraSpace_Optimal_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int left = 0;
        int right = 0;
        int index = 0;
        int[] ans = new int[m+n];
        while(left < m && right < n){

            if(nums1[left] <= nums2[right]){
                ans[index] = nums1[left];
                index++;
                left++;
            }else{
                ans[index] = nums2[right];
                index++;
                right++;
            }
        }

        while(left < m){
            ans[index++] = nums1[left++];
        }

        while(right < n){
            ans[index++] = nums2[right++];
        }

        for(int i =0; i<m+n; i++){
            nums1[i] = ans[i];
        }
    }
}