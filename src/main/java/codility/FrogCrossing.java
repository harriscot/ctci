package codility;

import java.util.HashSet;
import java.util.Set;

public class FrogCrossing {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    // A frog needs to jump from position 0 to position X+1.
// The array contains leaf positions. Calculate the earliest time that
// all positions are filled with leaves.

    // the important bit about this solution is that it uses a HashSet to collect the data.
    // HashSets are much faster than arrays so this solution actually gets 100% on the test.
    public int solution(int X, int[] A) {

        HashSet<Integer> riverMap = new HashSet<>();
        for(int i=0; i< X; i++){
            riverMap.add(i + 1);
        }
        System.out.println("river map sequence: " + riverMap);
        Set<Integer> fallenLeaves = new HashSet<>();

        for(int time=0; time < A.length; time++){
            fallenLeaves.add(A[time]);
            System.out.println("fallen leaves sequence: " + fallenLeaves);
            if(fallenLeaves.size() < riverMap.size()){
                continue;
            }
            if(fallenLeaves.containsAll(riverMap)){
                return time;
            }
        }
        return -1;
    }
}
