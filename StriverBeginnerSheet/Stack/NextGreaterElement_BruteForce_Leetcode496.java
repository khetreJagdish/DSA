public class NextGreaterElement_BruteForce_Leetcode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] ans = new int[nums1.length];
        HashMap<Integer,Integer>  hashMap = new HashMap<>();
        Arrays.fill(ans,-1);
        for(int i =0; i<nums2.length;){
            for(int j = i+1; j<nums2.length; j++){
                if(nums2[i] < nums2[j]){
                    hashMap.put(nums2[i], nums2[j]);
                    break;
                }
            }
        }


        for(int i = 0; i< nums1.length; i++){
            if(hashMap.get(nums1[i]) != null){
                ans[i] = hashMap.get(nums1[i]);
            }
        }

    return ans;   
    }
}