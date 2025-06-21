class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans= {-1,-1};
        int start=searchIndex(nums,target,true);
        int end=searchIndex(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    int searchIndex(int[] nums, int target, boolean Index){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                ans=mid;
                if(Index){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}