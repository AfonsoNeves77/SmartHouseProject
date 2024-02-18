package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class Exercicio16 {

    public static int numberEvaluation(int n){
        if(n <= 0){
            return -2;
        }
        int sum = 0;
        for(int i = 1; i < n; i++ ){
            if(n%i == 0){
                sum += i;
            }
        }
        if (sum == n)
            return 0;
        if (sum > n)
            return 1;
        return -1;
    }
}
