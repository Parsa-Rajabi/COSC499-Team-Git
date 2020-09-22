package fileAnalysis;

public class CountVowels { //class for counting vowels
    public static int countVowels(String inputString){ //static -> takes string, returns integer
        if (inputString==null || inputString.isEmpty()){ //check for empty and null strings
            return 0; //empty and null strings have no vowels
        } else {
            int numVowels = 0; //create vowel counter
            for (char ch : inputString.toCharArray()){ //look at each letter individually
                if (isVowel(ch)){
                    numVowels++; //if ch is a vowel, increment the number of vowels found
                }
            }
            return numVowels;
        } //close conditional
    } //close static method

    public static boolean isVowel(char ch){ //helper method for checking if character is a vowel
        String possibleVowels = "AEIOUaeiou"; //list of possible vowels for comparison
        if (possibleVowels.indexOf(ch)==-1){
            return false; //not a vowel
        } else {
            return true; //is a vowel
        }//close conditional
    }//close helper method
} //close class