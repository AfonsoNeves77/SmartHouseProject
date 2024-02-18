package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

import static pt.ipp.isep.dei.examples.basic.domain.Bloco4.CustomTools.intCountOfDigitsInNumber;

public class Exercicio1 {

    //dado um número inteiro positivo retorne o número de dígitos desse número.

    public static int digitCounter(int numero) {
        if (numero <= 0)
            return -1;
        return intCountOfDigitsInNumber(numero);
    }
}
