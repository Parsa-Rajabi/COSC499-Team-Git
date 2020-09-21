package fileAnalysis;

public class AnalyzeFile {
    public static void main(String [] args) {
        analyzeFile();
    }

    public static void analyzeFile() {
        try {
            String text = ReadFile.readFile("src/resources/SampleText.txt");
            // TODO: display analysis results here
            System.out.println("Number of words: " + CountWords.countWords(text));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

