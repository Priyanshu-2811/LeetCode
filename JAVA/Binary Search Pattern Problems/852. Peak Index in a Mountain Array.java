class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
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