class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums){
            if(even(num))
                count++;
        }
        return count;
    }
    boolean even(int num){
        int no_of_digit=digits(num);
        return no_of_digit % 2 == 0;
    }
    int digits(int num){
        if(num<0){
            num*=-1;
        }
        return (int)(Math.log10(num))+1;
    }
}