package codility;

public class LightBulbs {
     /*
      * Given an array of 1 - 10000 light bulbs, count lighting events.
      * The light bulbs are powered up one at a time, but are only lit if every bulb
      * with a lower number is also powered up.
      *
      * So for 2 1 3 5 4 we get:
      * position 0 powered - no lights on
      * position 1 powered - 2 lights on (1 and 2) - lighting events = 1
      * position 2 powered - 3 lights on (1,2 and 3) - lighting events = 2
      * position 3 powered - no lights on (as 1,2,3 and 5 are not sequential
      * position 4 powered - all lights on (all positions powered) - lighting events = 3.
      */

    /*
     Algorithm:
     Work through the numbers from 1 to the length of the array.
     For each number:
        Work through all the numbers from 1 to the current number.
            For each number:
                Check the array from 0 to (current number - 1) contains that number.
                If not found
                    return false
         return true
     if true
        increment the lightingEvents counter
     */
    int solution(int[] bulbs){
        int lightingEvents = 0;
        for(int i = 1; i<= bulbs.length; i++){
            if(checkForLightingEvent(bulbs, i)){
                lightingEvents ++;
            }
        }
        return lightingEvents;
    }

    private boolean checkForLightingEvent(int[] bulbs, int i) {
        for(int j = 1; j <= i; j++){
            boolean found = false;
            for(int k = 0; k < i; k++){
                if(bulbs[k] == j){
                    found = true;
                }
            }
            if(!found) return false;
        }
        return true;
    }
}
