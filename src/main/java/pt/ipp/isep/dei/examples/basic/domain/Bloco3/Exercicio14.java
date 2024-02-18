package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class Exercicio14 {
    public static boolean isCCvalid (int num){ // 123456789
        int [] array = TiagoTools.intNumDigitExtractionIntoArray(num);
        if (array.length != 9){
            return false;
        }
        int ponderada = array[0]*9 + array[1]*8 +array[2]*7 +array[3]*6 +array[4]*5 +array[5]*4 +array[6]*3 +array[7]*2 + array[8];
        if (ponderada % 11 == 0){
            return true;
        } else {
            return false;
        }
    }
}
