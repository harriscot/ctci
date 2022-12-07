package ctci.ch2_arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDupsTest {
    RemoveDups rd;
    @BeforeEach
    public void setUp() {
        rd = new RemoveDups();
    }

    @Test
    public void test1() {
        LinkedList list = new LinkedList(new Node(15));
        list.add(22);
        list.add(12);
        rd.setList(list);

//        rd.

    }
}