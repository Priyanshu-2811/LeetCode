class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            // Search sorted side left or right then apply BS
            if(nums[start]<=nums[mid]){ // Left Sorted Condition
                if(nums[start] <= target && target <= nums[mid]){  //Search left part of nums array
                    end=mid-1;
                }
                else{ 
                    start=mid+1;
                }
            }
            else{ // Right Sorted Condition
                if(nums[mid] <= target && target <= nums[end]){  // Seach right part of nums array
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }
}