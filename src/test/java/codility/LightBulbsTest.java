package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LightBulbsTest {
    LightBulbs lightBulbs;

    @BeforeEach
    public void setUp() {
        lightBulbs = new LightBulbs();
    }

    @Test
    public void test1() {
        int [] testArray = {2,1,3,5,4};
        assertEquals(3, lightBulbs.solution(testArray));
        int [] moreData = {3,1,2,6,4,5};
        assertEquals(2, lightBulbs.solution(moreData));
        int [] oneLight = {9,8,7,6,5,4,3,2,1};
        assertEquals(1, lightBulbs.solution(oneLight));
    }

}