package pt.ipp.isep.dei.examples.basic.domain.Bloco4;

public class Exercicio14 {
    public static double productElementsArrays(double[] array1,double[] array2){
        if((array1.length != array2.length) || (array1.length == 0)){
            return Double.NaN;
        }

        double product = 0;

        for(int i = 0; i < array1.length; i++){
            product += array1[i] * array2[i];
        }
        return product;
    }
}
