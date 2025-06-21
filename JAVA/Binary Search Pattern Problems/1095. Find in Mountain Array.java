/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak=PeakIndexInMountainArray(target,mountainArr);
        int asc=OrderAgnosticBS(target, mountainArr,0,peak);
        if(asc!=-1){
            return asc;
        }
        return OrderAgnosticBS(target, mountainArr,peak+1,mountainArr.length()-1);
    }
    int OrderAgnosticBS(int target, MountainArray mountainArr, int start, int end){
        
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mountainArr.get(mid)==target){
                return mid;
            }
            if(isAsc){
                if(target<mountainArr.get(mid)){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>mountainArr.get(mid)){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    int PeakIndexInMountainArray(int target, MountainArray mountainArr) {
        int start=0;
        int end=mountainArr.length()-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)){
                // You are in decreasing part of array
                // mid may be ans but check for left part
                // this is why end!= mid-1
                end=mid;
            }
            else{
                // You are in asc part of array
                start=mid+1;  // Bcoz mid+1 is greater than mid
            }

        }
        // At the end , start and end pointer are pointing to the largest number
            // start and end are always finding the largest element in above 2 checks
            // hence, they are pointing ot same max element
            // At evert point, start and end has bestv possible ans at that point 
            // But when only one element is remaining, hence it is the best
        return start; // return end both have same answer
    }
}