package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio2;

import pt.ipp.isep.dei.examples.basic.domain.Bloco3.AfonsoTools;


public class AfonsoEx2 {

    /*
    In the following exercises the exercise, implementation is almost always the calling of a method
    in AfonsoTools class. This happens because the exercises below are going to be useful in the solving of the
    rest of the block, like specified in AfonsoTools class.
    */

    //A)

    public static int numberOfMultiplesOfThree(int nMax, int nMin){
        return AfonsoTools.numberOfMultiplesOfaCertainNumber(3,nMax,nMin);
    }

    //B)

    public static int numberOfMultiplesOfaCertainNumber(int n, int nMax, int nMin){
        return AfonsoTools.numberOfMultiplesOfaCertainNumber(n,nMax,nMin);
    }

    //C/D

    public static int numberOfMultiplesOfTwoNumbers(int n,int z, int nMax, int nMin){
        return AfonsoTools.numberOfTwoMultiplesOfaCertainNumber(n,z,nMax,nMin);
    }

    //E)


    public static int sumOfTwoMultipleNumbers(int n, int z, int nMax, int nMin){
        if(AfonsoTools.isZero(n) && AfonsoTools.isZero(z)){
            return -1;
        }
        int[] array = AfonsoTools.multiplesOfTwoNumbers(n,z,nMax,nMin);

        return AfonsoTools.summingMultipleNumbers(array);
    }



}
