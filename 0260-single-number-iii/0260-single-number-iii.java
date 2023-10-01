class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int [] NoRes = {0,0};
        int CurrentNumber= nums[0] ;
        int FirstNumber =-1;
        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (CurrentNumber != nums[i] && counter == 0 ) {
                if (FirstNumber != -1) {

                    int [] Result = {FirstNumber , CurrentNumber};
                    return Result;
                }
                else {
                   FirstNumber = CurrentNumber;
                    CurrentNumber = nums[i];
                }
            } else if(CurrentNumber != nums[i] && counter != 0) {
                CurrentNumber = nums[i];
                counter = 0;
            }
            else {counter++; }
        }
        if (CurrentNumber == FirstNumber) {
            CurrentNumber = nums[nums.length-1];
            int [] Result = {FirstNumber , CurrentNumber};
            return Result;
        } else if (counter == 0) {
            int [] Result = {FirstNumber , CurrentNumber};
            return Result;
        }
        else {
            return NoRes;
        }
    }
}