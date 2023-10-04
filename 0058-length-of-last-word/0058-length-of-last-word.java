class Solution {
    public int lengthOfLastWord(String s) {
        String [] splitted = s.split(" ");
        String LastName = splitted[splitted.length-1];
        return LastName.length();
    }
}