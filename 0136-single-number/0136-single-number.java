class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int currentnumber= nums[0] ;
        int prevnumber = 0;
        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (currentnumber != nums[i] && counter == 0 ) {
                return currentnumber;
            } else if(currentnumber != nums[i] && counter != 0) {
                currentnumber = nums[i];
                counter = 0;
            }
            else {counter++; }
        }
        if (counter == 0) {
            return currentnumber;
        }
        else {
            return 0;
        }
    }
}