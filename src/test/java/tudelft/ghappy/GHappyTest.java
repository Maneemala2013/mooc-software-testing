package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    private GHappy test;
    @BeforeEach
    public void initialize() {
        test = new GHappy();
    }
    @Test
    public void noG() {
        boolean result = test.gHappy("xxxxthsss");
        Assertions.assertTrue(result);
    }

    @Test
    public void incorrectG() {
        boolean result = test.gHappy("xxxgthsss");
        Assertions.assertFalse(result);
    }
    @Test
    public void incorrectGWithCorrectG() {
        boolean result = test.gHappy("gffdcggb");
        Assertions.assertFalse(result);
    }
    @Test
    public void oneCorrectG() {
        boolean result = test.gHappy("ggxxxthsss");
        Assertions.assertTrue(result);
    }
    @Test
    public void CorrectGWithMultiplePositions() {
        boolean result = test.gHappy("xxxgggcvxggxgg");
        Assertions.assertTrue(result);
    }
}
