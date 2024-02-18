package pt.ipp.isep.dei.examples.basic.domain.Bloco3Test;

import org.junit.jupiter.api.Test;
import pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio10Test {
    @Test
    void currencyExchangeCalcD() {
        double euroAmmount = 5;
        char currency = 'D';
        double expected = 7.67;
        double result = Exercicio10.currencyExchangeCalc(euroAmmount, currency);
        assertEquals(expected, result);
    }
    @Test
    void currencyExchangeCalcL(){
        double euroAmmount = 5;
        char currency = 'L';
        double expected = 3.87;
        double result = Exercicio10.currencyExchangeCalc(euroAmmount,currency);
        assertEquals(expected,result);
    }
    @Test
    void currencyExchangeCalcI() {
        double euroAmmount = 5;
        char currency = 'I';
        double expected = 807.4;
        double result = Exercicio10.currencyExchangeCalc(euroAmmount, currency);
        assertEquals(expected, result);
    }
    @Test
    void currencyExchangeCalcC(){
        double euroAmmount = 5;
        char currency = 'C';
        double expected = 47.965;
        double result = Exercicio10.currencyExchangeCalc(euroAmmount,currency);
        assertEquals(expected,result);
    }

    @Test
    void currencyExchangeCalcF(){
        double euroAmmount = 5;
        char currency = 'F';
        double expected = 8.01;
        double result = Exercicio10.currencyExchangeCalc(euroAmmount,currency);
        assertEquals(expected,result);
    }
    @Test
    void currencyExchangeCalcError(){
        double euroAmmount = 5;
        char currency = 'G';
        double expected = -1;
        double result = Exercicio10.currencyExchangeCalc(euroAmmount,currency);
        assertEquals(expected,result);
    }

    @Test
    void currencyExchangeCalcNegativeEuro(){
        double euroAmmount = -5;
        char currency = 'G';
        double expected = -1;
        double result = Exercicio10.currencyExchangeCalc(euroAmmount,currency);
        assertEquals(expected,result);
    }
}
