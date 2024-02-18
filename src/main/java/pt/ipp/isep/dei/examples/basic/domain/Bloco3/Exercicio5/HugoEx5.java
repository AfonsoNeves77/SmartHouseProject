package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio5;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.HugoTools;

public class HugoEx5{
    // 5a ---------------------------------------------------------------------------
    public static boolean resolucao5a(long num){
        return HugoTools.isLongNumPalindrome(num);
    }
    // 5b ---------------------------------------------------------------------------
    public static boolean resolucao5b(long num){
        return HugoTools.isAmstrong(num);
    }
    // 5c ---------------------------------------------------------------------------
    public static long resolucao5c(int inf, int sup){
        if (!HugoTools.isRangeAscending(inf,sup)){
            return inf - 100;
        }
        long capicua = inf - 100;
        for (int i = inf; i <= sup; i++){
            if (HugoTools.isLongNumPalindrome(i)){
                capicua = i;
                break;
            }
        }
        return capicua;
    }
    // 5d-----------------------------------------------------------------------------
    public static long resolucao5d(int inf, int sup){
        int capicua = inf - 100;
        if (!HugoTools.isRangeAscending(inf,sup)){
            return capicua;
        }
        for (int i = inf; i <= sup; i++){
            if (HugoTools.isLongNumPalindrome(i)) {
                capicua = i;
            }
        }
        return capicua;
    }

    // 5e ------------------------------------------------------------------------------
    public static int resolucao5e (int inf, int sup){
        if (!HugoTools.isRangeAscending(inf, sup)) {
            return -1;
        }
        int counter = 0;
        for (int i = inf; i <= sup; i++) {
            if (HugoTools.isLongNumPalindrome(i)) {
                counter++;
            }
        }
        return counter;
    }
    public static long [] altResolucao5e(int inf, int sup) {
        long[] palindromeArray = new long[0];
        int index = 0;
        if (!HugoTools.isRangeAscending(inf, sup)) {
            return null;
        }
        for (int i = inf; i <= sup; i++) {
            if (HugoTools.isLongNumPalindrome(i)) {
                palindromeArray = HugoTools.increaseArraySizeByOneLong(palindromeArray);
                palindromeArray[index] = i;
                index++;
            }
        }
        return palindromeArray;
    }
    // 5f -------------------------------------------------------------------------------
    public static long resolucao5f(int inf, int sup){
        if (!HugoTools.isRangeAscending(inf,sup)){
            return -2;
        }
        long amstrong = -1;
        for (int i = inf; i <= sup; i++){
            if (HugoTools.isAmstrong(i)){
                amstrong = i;
                break;
            }
        }
        return amstrong;
    }
    // 5g ----------------------------------------------------------------------------------
    public static long [] resolucao5g(int inf, int sup){
        long[] amstrongArray = new long[0];
        int index = 0;
        if (!HugoTools.isRangeAscending(inf, sup)) {
            return null;
        }
        for (int i = inf; i <= sup; i++) {
            if (HugoTools.isAmstrong(i)) {
                amstrongArray = HugoTools.increaseArraySizeByOneLong(amstrongArray);
                amstrongArray[index] = i;
                index++;
            }
        }
        return amstrongArray;
    }
}
