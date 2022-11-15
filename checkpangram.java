//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class checkpangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        //returns without checking the sentence
        if (sentence.length()<26){
            return false;
        }
        for(int i = 0; i <= 26; i ++) {
            if(sentence.indexOf(( char) i + 97) < 0)
                return false;
        }
//        or
//        int [] count = new int[26];
//        for (int i = 0; i < sentence.length(); i++) {
//            count[sentence.charAt(i)-'a']++;
//        }
//        //traverse through the count array
//        for (int i = 0; i < 26; i++) {
//            if (count[i]==0){
//                return false;
//            }
//        }

//        or
//        for(char ch='a';ch<='z';ch++)
//        {
//            if(sentence.indexOf(ch)<0)
//            {
//                return false;
//            }
//        }

        return true;
    }
}
