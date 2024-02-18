package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4;

public class AndreEx4 {

    //EXERCICIO 4

    //a) contar número algarismos numero inteiro longo
    public static long contaNumeroAlgarismosNumInteiroLongo (long numero) {
        long counter = 0;
        if (numero == 0) {
            return 1;
        } else {
            while (numero != 0) {
                numero /= 10;
                counter++;
            }
        }
        return counter;
    }

    //b) numero algarismos pares numero inteiro longo
    public static long contaNumeroAlgarismosParesNumInteiroLongo (long numero) {
        long counter = 0;
        if (numero == 0) {
            return 1;
        } else {
            while (numero != 0) {
                numero /= 10;
                if (numero % 2 == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    //c) c) O número de algarismos ímpares de um número inteiro longo

    public static long contaNumeroAlgarismosImparesNumInteiroLongo (long numero) {
        long counter = 0;
        if (numero == 0) {
            return 1;
        } else {
            while (numero != 0) {
                numero /= 10;
                if (numero % 2 != 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    //d) A soma dos algarismos de um número inteiro longo
    // 12340 / 10 = 1234 - dá os algarismos à esquerda;
    //1234 % 10 = 0 - dá o algarismo à direita;

    public static long somaAlgarismosNumInteiroLongo (long numero) {
        long soma = 0;
        if (numero == 0){
            return 0;
        } else {
            while (numero != 0) {
                soma += numero % 10;
                numero /= 10;
            }
        }

        return soma;
    }

    //e) A soma dos algarismos pares de um número inteiro longo

    public static long somaAlgarismosParesNumInteiroLongo (long numero) {
        long soma = 0;
        if (numero == 0){
            return 0;
        } else {
            while (numero != 0) {
                if (numero % 2 == 0)
                    soma += numero % 10;
                    numero /= 10;
            }
        }
        return soma;
    }

    //f) A soma dos algarismos ímpares de um número inteiro longo.
    public static long somaAlgarismosImparesNumInteiroLongo (long numero) {
        long soma = 0;
        if (numero == 0){
            return 0;
        } else {
            while (numero != 0) {
                if (numero % 2 != 0)
                    soma += numero % 10;
                numero /= 10;
            }
        }
        return soma;
    }

    //g) A média dos algarismos de um número inteiro longo

    public static double mediaAlgarismosNumInteiroLongo (long numero) {
        double soma = 0;
        double counter = 0;
        if (numero == 0){
            return 0;
        } else {
            while (numero != 0) {
                soma += numero % 10;
                counter++;
                numero /= 10;
            }
        }
        return soma / counter;
    }

    //h) A média dos algarismos pares de um número inteiro longo.

    public static double mediaAlgarismosParesNumInteiroLongo (long numero) {
        double soma = 0;
        long counter = 0;
        if (numero == 0){
            return 0;
        } else {
            while (numero != 0) {
                if (numero % 2 == 0) {
                    soma += numero % 10;
                    counter++;
                }
                numero /= 10;
            }
        }
        return soma / counter;
    }

    //i) A média dos algarismos ímpares de um número inteiro longo
    public static double mediaAlgarismosImparesNumInteiroLongo (long numero) {
        double soma = 0;
        long counter = 0;
        if (numero == 0){
            return 0;
        } else {
            while (numero != 0) {
                if (numero % 2 != 0) {
                    soma += numero % 10; //soma = soma + numero % 10
                    counter++;
                }
                numero /= 10;
            }
        }
        return soma / counter;
    }

    //j) Um número inteiro longo cujos dígitos estão pela ordem inversa (e.g. dado 987 retorna 789)

    public static long inverteOrdemAlgarismosIntLongo (long numero) {
        long soma = 0;
        if (numero == 0) {
            return 0;
        } while (numero > 0 || numero < 0) {
            soma = soma * 10 + numero % 10;
            numero /= 10;
        }
        return soma;
    }
}
