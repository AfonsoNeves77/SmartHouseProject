package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

public class Exercicio3 {

    //Construa uma solução em Java que calcule a soma dos elementos de um vetor

    public static int sumArrayElements(int[] array) {
        int sum = 0;
        for (int index = 0; index < array.length; index++)
            sum += array[index];
        return sum;
    }
}
