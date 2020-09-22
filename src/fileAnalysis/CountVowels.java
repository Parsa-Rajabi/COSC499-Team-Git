package fileAnalysis;

public class CountVowels {
    public static int countVowels(String inputString){ //static -> takes string, returns integer
        if (inputString==null || inputString.isEmpty()){ //Check for empty and null strings
            return 0; //Empty and null strings have no vowels
        } else {
            int numVowels = 0; // create vowel counter
            //TODO
            //finish counting algorithm here
            for (char ch : inputString.toCharArray()){
                if (isVowel(ch)){
                    numVowels++;
                }
            }
            return numVowels;
        } //close conditional


    } //close static method

    public static boolean isVowel(char ch){
        String possibleVowels = "AEIOUaeiou";
                if (possibleVowels.indexOf(ch)==-1){
                    return false;
                } else {
                    return true;
                }
    }


} //close class