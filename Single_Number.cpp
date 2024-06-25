class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int i=0;
        for(i=0;i<nums.size();i++)
       {
            int count = std::count(nums.begin(), nums.end(), nums[i]);
            if(count==1)
                break;
       } 
       return nums[i];
    }
};