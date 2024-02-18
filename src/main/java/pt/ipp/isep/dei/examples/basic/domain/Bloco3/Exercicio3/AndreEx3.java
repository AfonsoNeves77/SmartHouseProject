package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio3;

public class AndreEx3 {

    //a) soma de pares num intervalo

    public static int calcularSomaParesNumIntervalo (int min, int max) {
        if (min < 0 || min > max) {
            return -1;
        }
        int soma = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                soma = i + soma;
            }
        }
        return soma;
    }

    //b) Quantidade pares num intervalo
    public static int calcularQuantidadeParesNumIntervalo (int min, int max) {
        if (min < 0 || min > max) {
            return -1;
        }
        int counter = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    //c) soma de pares num intervalo

    public static int calcularSomaImparesNumIntervalo (int min, int max) {
        if (min < 0 || min > max) {
            return -1;
        }
        int soma = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                soma = i + soma;
            }
        }
        return soma;
    }

    //d) Quantidade pares num intervalo
    public static int calcularQuantidadeImparesNumIntervalo (int min, int max) {
        if (min < 0 || min > max) {
            return -1;
        }
        int counter = 0;
        for (int i = min; i <= max; i++) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    //e) A soma de todos os números múltiplos de um dado número num dado intervalo. Os dois
    //números, que definem os limites do intervalo, não estão necessariamente por ordem crescente
    public static int somaMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescente (int min, int max, int numero) {
        if (min < 0) {
            return -1;
        } else if (max < min) {
            int aux;
            aux = max;
            max = min;
            min = aux;
        }
        int soma = 0;
        for (int i = min; i <= max; i++) {
            if (i % numero == 0) {
                soma = i + soma;
            }
        }
        return soma;
    }

    //f) produto de multiplos dado intervalo

    public static int produtoMultiplosDadoNumeroNumIntervaloCrescenteOuDecrescente (int min, int max, int numero) {
        if (min < 0) {
            return -1;
        } else if (max < min) {
            int aux;
            aux = max;
            max = min;
            min = aux;
        }
        int produto = 1;
        for (int i = min; i <= max; i++) {
            if (i % numero == 0) {
                produto *= i; //produto = i * produto;
            }
        }
        return produto;
    }

    //g) média da soma dos multiplos
    public static double mediaMultiplosDadoNumeroNumIntervalo (int min, int max, int numero) {
        if (min < 0) {
            return -1;
        } else if (max < min) {
            int aux;
            aux = max;
            max = min;
            min = aux;
        }
        int soma = 0;
        double counter = 0;
        for (int i = min; i <= max; i++) {
            if (i % numero == 0) {
                soma = i + soma;
                counter ++;
            }
        }
        return soma / counter;
    }

    //f) A média dos múltiplos de X ou Y num intervalo definido por dois números. X e Y são dados.
    public static double mediaMultiplosDeDoisNumerosNumIntervalo (int min, int max, int numero1, int numero2) {
        if (min < 0) {
            return -1;
        } else if (max < min) {
            int aux;
            aux = max;
            max = min;
            min = aux;
        }
        int soma = 0;
        double counter = 0;
        for (int i = min; i <= max; i++) {
            if (i % numero1 == 0 || i % numero2 == 0) {
                soma = i + soma;
                counter ++;
            }
        }
        return soma / counter;
    }
}