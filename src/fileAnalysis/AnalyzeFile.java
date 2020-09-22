package fileAnalysis;

public class AnalyzeFile {
    public static void main(String [] args) {
        analyzeFile();
    }

    public static void analyzeFile() {
        try {
            String text = ReadFile.readFile("resources/SampleText.txt");
            System.out.println("Number of words: " + CountWords.countWords(text));
            System.out.println("Number of characters: " + CountChar.countChar(text));
            int numOfVowels = CountVowels.countVowels(text);
            System.out.println("Number of vowels: " + numOfVowels);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

