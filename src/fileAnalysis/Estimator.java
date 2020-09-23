package fileAnalysis;

public class Estimator {
    public static double timeToReadAloud(String text) {
        double timeToReadAloud = 0;

        // average words per minute spoken aloud according to http://www.speechinminutes.com/
        double wpm = 130;

        int numWords = CountWords.countWords(text);
        timeToReadAloud = numWords / wpm;

        return timeToReadAloud;
    }
}
