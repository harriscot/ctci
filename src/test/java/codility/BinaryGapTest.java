package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {
    BinaryGap gap;

    @BeforeEach
    public void setUp(){
        gap = new BinaryGap();
    }

    @Test
    public void largeNumberTest() {
        int input = 74901729;
        assertEquals(4, gap.solution(input));
    }

    @Test
    public void largeNumberTest2() {
        int input = 561892;
        assertEquals(3, gap.solution(input));
    }

    @Test
    public void largeNumberTest3() {
        int input = 1376796946;
        assertEquals(5, gap.solution(input));
    }

}