package codility;

public class BinaryGap {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

        public int solution(int N) {
            int longestBinaryGap = 0;
            // write your code in Java SE 8
            String numberAsBinary = Integer.toBinaryString(N);
            char[] binaryArray = numberAsBinary.toCharArray();
            int possibleGap = 0;
            System.out.println(binaryArray);

            for(int i=0; i < binaryArray.length; i++){
                if(binaryArray[i] == '1' && binaryArray[i+1] == '0'){
                    possibleGap = 0;
                    for(int j = i+1; j< binaryArray.length; j++){
                        if(binaryArray[j] == '0'){
                            possibleGap ++;
                        } else {
                            if(possibleGap > longestBinaryGap){
                                longestBinaryGap = possibleGap;
                                i = j;
                            }
                            possibleGap = 0;
                        }
                    }
                }
            }
            return longestBinaryGap;
        }

}
