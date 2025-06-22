class Solution {
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        // int index=0;
        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i])){
        //         continue;
        //     }
        //     else{
        //         set.add(nums[i]);
        //         nums[index++]=nums[i];
        //     }
        // }
        // return set.size();

        // 2nd Apporach
        int j=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j] ){
                nums[j+1]=nums[i];
                j++;
            }
        }
        return j+1;
    }
}