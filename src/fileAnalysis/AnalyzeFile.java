package fileAnalysis;

public class AnalyzeFile {
    public static void main(String [] args) {
        analyzeFile();
    }

    public static void analyzeFile() {
        try {
            String text = ReadFile.readFile("src/resources/SampleText.txt");
            // TODO: display analysis results here
            // ex. System.out.println("Number of words: " + countWords(text))
            System.out.println("Number of characters: " + charCount.countChar(text));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

