class Solution {
        public boolean isPalindrome(int x) {
            String num = Integer.toString(x);
            int i = 0 ;
            int j = num.length()-1;
            while (i!=j && i < j) {
                if (num.charAt(i) == num.charAt(j)) {
                    i++;
                    j--;
                    continue;
                }
                else {
                    return false;
                }

            }
            return true;
        }


}


