
import java.util.StringJoiner;


class Solution {
    public String reverseWords(String name) {
        String [] Splited = name.split(" ");
        String [] Flipped = new String[Splited.length];
        char ch ;
        for (int i = 0; i< Splited.length; i++)
        {
            String theString = Splited[i];
            Flipped[i] = "";
            for (int j = 0; j < theString.length(); j++) {

                //extracts each character
                ch= Splited[i].charAt(j);
                Flipped[i]= ch+Flipped[i]; //adds each character in front of the existing string
            }
        }
        StringJoiner joiner = new StringJoiner(" ");
        for(int i = 0; i < Flipped.length; i++) {
            joiner.add(Flipped[i]);
        }
        String str = joiner.toString();
        return str;
    }
}