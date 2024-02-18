package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio5;

public class TiagoEx5 {
    //Ex5a-------------------------------------------------------------------------------------------
    public static boolean isPalindrome(int num){
        if(num==0){
            return true;
        }
        int reverse=0;
        int finalNumber = num;
        while (num > 0){
            reverse = reverse * 10 + num % 10;
            num/= 10;
        }
        return finalNumber==reverse;
    }
    //Ex5B-------------------------------------------------------------------------------------------------
    public static boolean isArmStrong(int num){
        if(num==0){
            return true;
        }
        int somaAoCubo=0;
        int finalNumber = num;
        while (num > 0){
            somaAoCubo += (int) Math.pow(num % 10, 3);
            num/= 10;
        }
        return somaAoCubo == finalNumber;
    }
    //Ex5C-----------------------------------------------------------------------------------------------
    public static int firstPalindrome(int inf, int sup){
        for (int i = inf; i <= sup; i++){
            if (isPalindrome(i)){
                return i;
            }
        }
        return -1;
    }
    //Ex5D------------------------------------------------------------------------------------------------
    public static int biggestPalindrome(int inf, int sup){
        int biggestPalindrome = -1;
        for (int i = inf; i <= sup; i++){
            if (isPalindrome(i)){
                biggestPalindrome = i;
            }
        }
        return biggestPalindrome;
    }
    //Ex5E-------------------------------------------------------------------------------------------------
    public static int numberOfPalindromes(int inf, int sup){
        int counter = 0;
        for (int i = inf; i <= sup; i++){
            if (isPalindrome(i)){
                counter++;
            }
        }
        return counter;
    }
    //Ex5F--------------------------------------------------------------------------------------------------
    public static int firstArmstrong(int inf, int sup) {
        for (int i = inf; i <= sup; i++) {
            if (isArmStrong(i)) {
                return i;
            }
        }
        return -1;
    }
    //Ex5G------------------------------------------------------------------------------------------------
    public static int numberOfArmstrongs(int inf, int sup){
        int counter = 0;
        for (int i = inf; i <= sup; i++){
            if (isArmStrong(i)){
                counter++;
            }
        }
        return counter;
    }
}

