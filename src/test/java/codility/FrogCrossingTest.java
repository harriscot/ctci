package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogCrossingTest {
    FrogCrossing crossing;
    @BeforeEach
    public void setUp(){
        crossing = new FrogCrossing();
    }

    @Test
    public void happyPath() {
        int [] leafFalls = {1,3,1,4,2,3,5,4};
        assertEquals(6, crossing.solution(5, leafFalls));
    }
}