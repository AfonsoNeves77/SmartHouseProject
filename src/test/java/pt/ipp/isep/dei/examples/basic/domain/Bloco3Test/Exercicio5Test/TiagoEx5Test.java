package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test.Exercicio5Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio5.TiagoEx5;

import static org.junit.jupiter.api.Assertions.*;

public class TiagoEx5Test {
    @Test
    void isPalindromeSucess(){
        int num= 11;
        boolean result = TiagoEx5.isPalindrome(num);
        assertTrue(result);
    }
    @Test
    void isPalindromeSucessFalse(){
        int num= 56984;
        boolean result = TiagoEx5.isPalindrome(num);
        assertFalse(result);
    }
    @Test
    void isPalindromeSucess0(){
        int num= 0;
        boolean result = TiagoEx5.isPalindrome(num);
        assertTrue(result);
    }
    //Ex5B-----------------------------------------------------------------------------------------
    @Test
    void isArmstrong(){
        int num = 153;
        boolean result = TiagoEx5.isArmStrong(num);
        assertTrue(result);
    }
    @Test
    void isArmstrongFalse(){
        int num = 144;
        boolean result = TiagoEx5.isArmStrong(num);
        assertFalse(result);
    }
//Ex5C---------------------------------------------------------------------------------------------

    @Test
    void firstPalindrome() {
        int inf = 10;
        int sup = 15;
        int expected = 11;
        int result = TiagoEx5.firstPalindrome(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void infAndSupAreEqual() {
        int inf = 8;
        int sup = 8;
        int expected = 8;
        int result = TiagoEx5.firstPalindrome(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void invertedIntervals() {
        int inf = 15;
        int sup = 10;
        int expected = -1;
        int result = TiagoEx5.firstPalindrome(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void firstPalindromeInsucess() {
        int inf = 12;
        int sup = 15;
        int expected = -1;
        int result = TiagoEx5.firstPalindrome(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void firstPalindrome0() {
        int inf = 0;
        int sup = 3;
        int expected = 0;
        int result = TiagoEx5.firstPalindrome(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void firstPalindromeInvert() {
        int inf = 3;
        int sup = 0;
        int expected = -1;
        int result = TiagoEx5.firstPalindrome(inf, sup);
        assertEquals(expected, result);
    }
    //Ex5D----------------------------------------------------------------------------------------------
    @Test
    void biggestPalindrome() {
        int inf = 1;
        int sup = 9;
        int expected = 9;
        int result = TiagoEx5.biggestPalindrome(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void minBiggerThenMax() {
        int inf = 9;
        int sup = 1;
        int expected = -1;
        int result = TiagoEx5.biggestPalindrome(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void biggestPalindromeNoneFound() {
        int inf = 12;
        int sup = 15;
        int expected = -1;
        int result = TiagoEx5.biggestPalindrome(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void biggestPalindromeNoInterval() {
        int inf = 11;
        int sup = 11;
        int expected = 11;
        int result = TiagoEx5.biggestPalindrome(inf, sup);
        assertEquals(expected, result);
    }
    //Ex5E--------------------------------------------------------------------------------------------
    @Test
    void numberOfPalindromes(){
        int inf = 1;
        int sup = 9;
        int expected = 9;
        int result = TiagoEx5.numberOfPalindromes(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void numberOfPalindromesNoneFound(){
        int inf = 12;
        int sup = 13;
        int expected = 0;
        int result = TiagoEx5.numberOfPalindromes(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void equalIntervalsNumberOfPalindromes(){
        int inf = 12;
        int sup = 13;
        int expected = 0;
        int result = TiagoEx5.numberOfPalindromes(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void numberOfPalindromesInversed(){
        int inf = 13;
        int sup = 12;
        int expected = 0;
        int result = TiagoEx5.numberOfPalindromes(inf, sup);
        assertEquals(expected, result);
    }
    //Ex5F---------------------------------------------------------------------------------------------
    @Test
    void firstArmstrong(){
        int inf = 152;
        int sup = 154;
        int expected = 153;
        int result = TiagoEx5.firstArmstrong(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void equalIntervalsFirstArmstrong(){
        int inf = 153;
        int sup = 153;
        int expected = 153;
        int result = TiagoEx5.firstArmstrong(inf, sup);
        assertEquals(expected, result);
    }

    @Test
    void firstArmstrongNoneFound(){
        int inf = 154;
        int sup = 157;
        int expected = -1;
        int result = TiagoEx5.firstArmstrong(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void firstArmstrongInversed(){
        int inf = 157;
        int sup = 154;
        int expected = -1;
        int result = TiagoEx5.firstArmstrong(inf, sup);
        assertEquals(expected, result);
    }
    //Ex5G----------------------------------------------------------------------------------
    @Test
    void numberOfArmstrongs(){
        int inf = 0;
        int sup = 3;
        int expected = 2;
        int result = TiagoEx5.numberOfArmstrongs(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void equalIntervals(){
        int inf = 3;
        int sup = 3;
        int expected = 0;
        int result = TiagoEx5.numberOfArmstrongs(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void numberOfArmstrongsNoneFound(){
        int inf = 3;
        int sup = 4;
        int expected = 0;
        int result = TiagoEx5.numberOfArmstrongs(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void numberOfArmstrongsInverted(){
        int inf = 4;
        int sup = 3;
        int expected = 0;
        int result = TiagoEx5.numberOfArmstrongs(inf, sup);
        assertEquals(expected, result);
    }
    @Test
    void numberOfArmstrongsInverteduu(){
        int inf = 152;
        int sup = 153;
        int expected = 1;
        int result = TiagoEx5.numberOfArmstrongs(inf, sup);
        assertEquals(expected, result);
    }
}
