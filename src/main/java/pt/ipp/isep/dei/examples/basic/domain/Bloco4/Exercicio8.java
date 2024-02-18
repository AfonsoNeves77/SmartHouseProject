package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

public class Exercicio8 {
    /**
     * @param arrayOfNumbers
     * @param numberOfElements
     * @return array with only the first N elements from the original array.
     */
    public static int[] firstNElementsOfAVector(int[] arrayOfNumbers, int numberOfElements) {
        if (numberOfElements < 0)
            return null;

        int[] elementsRequired = new int[numberOfElements];
        for(int i = 0; i < numberOfElements; i++) {
            elementsRequired[i] = arrayOfNumbers[i];
        }
        return elementsRequired;
    }
}
