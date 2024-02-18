package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

import static pt.ipp.isep.dei.examples.basic.domain.Bloco4.CustomTools.*;


public class Exercicio2 {

    //dado um número inteiro positivo retorne um vetor em que os seus
    //elementos correspondem aos dígitos do número dado

    //Feito de raiz - estudo

    public static int[] numDigitsIntoArray(int num) {
        if (num <= 0){
            return null;
        }
        int countOfDigits = intCountOfDigitsInNumber(num);
        int[] digitsOfNum = new int[countOfDigits];
        for (int i = countOfDigits-1; i >= 0; i--) {
            digitsOfNum[i] = num % 10;
            num /= 10;
        }
        return digitsOfNum;
    }
    //reutilizando solução em customTools, caso já disponível.

}
