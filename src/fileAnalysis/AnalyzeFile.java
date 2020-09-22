package fileAnalysis;

public class AnalyzeFile {
    public static void main(String [] args) {
        analyzeFile();
    }

    public static void analyzeFile() {
        try {
            String text = ReadFile.readFile("src/resources/SampleText.txt");
<<<<<<< HEAD
            // TODO: display analysis results here
            System.out.println("Number of words: " + CountWords.countWords(text));

=======
            int numOfVowels = CountVowels.countVowels(text);
            System.out.println("Number of vowels: " + numOfVowels);
>>>>>>> a9c69b5... Update AnalyzeFile.java
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

