class Solution {
   public int mySqrt(int x) {
        int negtivenumber= 1;
        int counter = 0;
        while(x >= 0){
            x = x-negtivenumber;
            negtivenumber = negtivenumber +2;
            if (x<0)
            {
                break;
            }
             counter++ ;
        }
        return counter;
    }
}