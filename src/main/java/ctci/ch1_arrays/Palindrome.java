package ctci.ch1_arrays;

import java.lang.Character;
public class Palindrome {
    /*
     * Given a string, check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same
     * forwards and backwards. The palindrome does not need to be limited to dictionary words.
     */
    public boolean checkPalindrome(String input){
        char[] characters = input.trim().toCharArray();
        int[] characterMap = new int[128]; // assuming ascii character set

        for(int i=0; i < characters.length; i++){
            int numericValue = Character.getNumericValue(characters[i]);
            if(numericValue > 0) {
                int count = characterMap[numericValue];
                characterMap[numericValue] = ++count;
            }
        }

        if(moreThanOneSingleCharacter(characterMap)){
            return false;
        }

        if(balancedPalindrome(input)) {
            return true;
        }
        return false;
    }

    private boolean balancedPalindrome(String input){
        String inputNoSpaces = input.replaceAll(" ", "");
        char[] chars = inputNoSpaces.trim().toCharArray();
        for(int i = 0, j = chars.length - 1; i < chars.length / 2; i++, j-- ){
            System.out.println("comparing: position: " + i + " value: " + chars[i] + " with position: " + j + " value: " + chars[j]);
            if(chars[i] != chars[j]){
                return false;
            }
        }
        return true;
    }

    private boolean moreThanOneSingleCharacter(int[] chars){
        int oddCount = 0;
        for(int i = 0; i < chars.length; i++){
            if(chars[i] % 2 == 1){
                ++ oddCount;
                if(oddCount > 1){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String... args){
        Palindrome pal = new Palindrome();
        String palindrome = "a man a plan a canal panama";
        String nonpal = "Top gear is very silly";
        System.out.println(nonpal + (pal.checkPalindrome(nonpal) ? " is a palindrome" : " is not a palindrome"));
    }
}