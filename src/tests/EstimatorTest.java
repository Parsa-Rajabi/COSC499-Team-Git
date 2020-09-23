package tests;

import fileAnalysis.Estimator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstimatorTest {
    @Test
    public void shouldEstimateMinutesCorrectlyWhenWordsArePresent() {
        // expected result
        double expectedNumMinutes = 6.0;

        // given
        String aText780WordsLong = "";
        for (int i = 0; i < 780; i++) {
            aText780WordsLong += "aaaaa ";
        }

        // when
        double estimatedNumMinutes = Estimator.timeToReadAloud(aText780WordsLong);

        // then
        assertEquals(expectedNumMinutes, estimatedNumMinutes);
    }

    @Test
    public void shouldEstimateMinutesCorrectlyWhenNoWordsArePresent() {
        // expected result
        double expectedNumMinutes = 0;

        // given
        String emptyString = "";

        // when
        double estimatedNumMinutes = Estimator.timeToReadAloud(emptyString);

        // then
        assertEquals(expectedNumMinutes, estimatedNumMinutes);
    }
}
