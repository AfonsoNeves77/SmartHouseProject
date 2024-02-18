package pt.ipp.isep.dei.examples.basic.domain.Bloco4Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio11;
import pt.ipp.isep.dei.examples.basic.domain.Bloco4.Exercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio14Test {

    @Test
    void dotProductOfTwoVectors_SameLengths() {
        new Exercicio14();
        //Arrange
        double[] a = {1,2,3,1};
        double[] b = {2,2,3,1};
        double expected = 16;
        //Act
        double result = Exercicio14.productElementsArrays(a,b);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void dotProductOfTwoVectors_DifferentLengths() {
        //Arrange
        double[] a = {1,2,3,7,2};
        double[] b = {2,2,3,7};
        double expected = Double.NaN;
        //Act
        double result = Exercicio14.productElementsArrays(a,b);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void dotProductOfTwoVectors_OneVectorLengthZero() {
        //Arrange
        double[] a = {};
        double[] b = {2,2,3,7};
        double expected = Double.NaN;
        //Act
        double result = Exercicio14.productElementsArrays(a,b);
        //Assert
        assertEquals(expected,result);
    }

    @Test
    void dotProductOfTwoVectors_VectorsWithDoubleElements() {
        //Arrange
        double[] a = {2.4,4.1,6.9};
        double[] b = {4.8,-6,8};
        double expected = 42.12;
        //Act
        double result = Exercicio14.productElementsArrays(a,b);
        //Assert
        assertEquals(expected,result,0.01);
    }

}
