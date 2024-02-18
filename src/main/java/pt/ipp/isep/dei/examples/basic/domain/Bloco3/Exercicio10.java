package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class Exercicio10 {
    public static double currencyExchangeCalc(double euroAmmount, char currency){
        //String currencyType = "";
        if (euroAmmount <= 0){
            return -1;
        }
        double exchangeValue = 0;
        switch (currency){
            case 'D':
                //currencyType = "Dollar";
                exchangeValue = 1.534;
                break;
            case 'L':
                //currencyType = "Pound";
                exchangeValue = 0.774;
                break;
            case 'I':
                //currencyType = "Yen";
                exchangeValue = 161.480;
                break;
            case 'C':
                //currencyType = "Swedish Crown";
                exchangeValue = 9.593;
                break;
            case 'F':
                //currencyType = "Swiss Frank";
                exchangeValue = 1.602;
                break;
            default:
                //return "Currency not supported";
                return -1;
        }
        exchangeValue = exchangeValue * euroAmmount;
        //return "Your " + euroAmmount + " euros are worth " + exchangeValue + " in " + currencyType;
        return exchangeValue;
    }
}
