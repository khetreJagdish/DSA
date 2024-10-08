class NumberOfTimesArrayHasBeenRotated {
    public int findKRotation(List<Integer> arr) {
        // Code here
        
        int minIndex = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.size()-1;
        
        while(low <= high){
                
            int mid = low + (high-low)/2;
            
            if(arr.get(low) <= arr.get(high)){
                if(arr.get(low) <= min){
                    minIndex = low;
                }
                break;
            }
            
            if(arr.get(low) <= arr.get(mid)){
                if(arr.get(low) <= min){
                    minIndex = low;
                    min = arr.get(low);
                }
                low = mid +1;
            }else{
                if(arr.get(mid) <= min){
                    minIndex = mid;
                    min = arr.get(mid);
                }
                high = mid-1;
            }
        }
    return minIndex;
        
    }
}