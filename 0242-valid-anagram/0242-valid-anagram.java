class Solution {
public boolean isAnagram(String s, String t) {
        // Convert the string to a character array
        char[] charArray1 = s.toCharArray();

        // Sort the character array
        Arrays.sort(charArray1);


        // Convert the string to a character array
        char[] charArray2 = t.toCharArray();

        // Sort the character array
        Arrays.sort(charArray2);

        if (charArray2.length != charArray1.length) {
            return false;
        }
        String sortedString = new String(charArray1);
        String sortedString2 = new String(charArray2);

        if (sortedString.equals(sortedString2))
        {return true;}
        return false;
    }
}