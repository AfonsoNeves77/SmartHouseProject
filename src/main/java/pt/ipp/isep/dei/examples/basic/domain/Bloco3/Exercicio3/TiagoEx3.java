package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3;

public class TiagoEx3 {
    public static int sumOfEvenNumbersInARange(int inf, int sup) {
        int sum = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    //Exercicio3B-----------------------------------------------------------------------------------------------------------
    public static int evenNumbersInARange(int inf, int sup) {
        int counter = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
//Exercicio3C-----------------------------------------------------------------------------------------------------------

    public static int sumOfOddNumbersInRange(int inf, int sup) {
        int sum = 0;
        for (int i = inf; i<= sup; i++) {
            if (i % 2 !=0) {
                sum = sum +i;
            }
        }
        return sum;
    }
//Exercicio3D-----------------------------------------------------------------------------------------------------------

    public static int OddNumbersInARange(int inf, int sup) {
        int counter = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % 2 !=0) {
                counter++;
            }
        }
        return counter;
    }
    //Exercicio3E-----------------------------------------------------------------------------------------------------------
    public static int resolucao3e(int num, int inf, int sup) {
        if (inf > sup) {
            int aux;
            aux = inf;
            inf = sup;
            sup = aux;
        }
        int soma = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % num == 0) {

                soma = soma + i;
            }
        }
        return soma;
    }

//Exercicio3F-----------------------------------------------------------------------------------------------------------

    public static int resolucao3f(int num, int inf, int sup) {
        if (inf > sup) {
            int aux;
            aux = inf;
            inf = sup;
            sup = aux;
        }
        int multiplicacao = 1;
        for (int i = inf; i <= sup; i++) {
            if (i % num == 0) {

                multiplicacao = multiplicacao * i;
            }
        }
        return multiplicacao;
    }
//Exercicio3G-----------------------------------------------------------------------------------------------------------

    public static double resolucao3g(int num, int inf, int sup) {
        if (inf > sup) {
            int aux;
            aux = inf;
            inf = sup;
            sup = aux;
        }
        double count = 0;
        double soma = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % num == 0) {
                soma += i;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return soma / count;
    }

//Exercicio3H-----------------------------------------------------------------------------------------------------------

    public static double resolucao3h(int x, int y, int inf, int sup) {
        if (inf > sup) {
            int aux;
            aux = inf;
            inf = sup;
            sup = aux;
        }
        double count = 0;
        double soma = 0;
        for (int i = inf; i <= sup; i++) {
            if (i % x == 0 || i % y == 0) {
                soma += i;
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return soma / count;
    }

}

