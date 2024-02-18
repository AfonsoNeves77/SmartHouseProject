package pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio5;

import static pt.ipp.isep.dei.examples.basic.domain.Bloco3.Exercicio4.AndreEx4.contaNumeroAlgarismosNumInteiroLongo;

public class AndreEx5 {

    //EXERCICIO 5

    //a) Verifique se um número inteiro longo é capicua

    public static boolean verificaSeNumeroCapicua (long numero) {
        if (numero == 0)
            return false;

        long auxiliar = numero;
        long soma = 0;
        while (numero != 0) {
            soma = soma * 10 + numero % 10;
            numero /= 10;
        }
        if (soma == auxiliar)
            return true;
        return false;
    }

    //b) Verifique se um dado número é um número de Amstrong, i.e. se for igual à soma dos cubos
    //dos seus algarismos.

    public static boolean verificaSeNumeroArmstrong (long numero) {
        if (numero == 0)
            return false;
        long contador = contaNumeroAlgarismosNumInteiroLongo(numero);
        long auxiliar = numero;
        long soma = 0;
        while (numero != 0) {
            soma += Math.pow((numero % 10),contador);
            numero /= 10;
        }
        if (soma == auxiliar)
            return true;
        return false;
    }

    //c) Retorne a primeira capicua num dado intervalo.

    public static int retornaPrimeiraCapicuaNumIntervalo (int inferior, int superior) {
        if (inferior > superior)
            return -1;

        for (int i = inferior; i <= superior; i++) {
            if (verificaSeNumeroCapicua(i))
                return i;
        }
        return -1;
    }

    //d) Retorne a maior capicua num dado intervalo
    public static int retornaMaiorCapicuaNumIntervalo (int inferior, int superior) {
        if (inferior > superior)
            return -1;

        for (int i = superior; i >= inferior; i--) {
            if (verificaSeNumeroCapicua(i))
                return i;
        }
        return -1;
    }

    //e) Retorne o número de capicuas num dado intervalo.
    public static int retornaQuantidadeCapicuasNumIntervalo (int inferior, int superior) {
        if (inferior > superior)
            return -1;
        int contador = 0;
        for (int i = inferior; i <= superior; i++) {
            if (verificaSeNumeroCapicua(i))
                contador++;
        }
        return contador;
    }

    //f) Retorne o primeiro número de Amstrong num dado intervalo
    public static int retornaPrimeiroNumeroArmstrongNumIntervalo (int inferior, int superior) {
        if (inferior > superior)
            return -1;
        for (int i = inferior; i <= superior; i++) {
            if (verificaSeNumeroArmstrong(i))
                return i;
        }
        return -1;
    }

    //g) Retorne a quantidade de números de Amstrong num dado intervalo

    public static int retornaQuantidadeNumerosArmstrongNumIntervalo (int inferior, int superior) {
        if (inferior > superior)
            return -1;
        int contador = 0;
        for (int i = inferior; i <= superior; i++) {
            if (verificaSeNumeroArmstrong(i))
                contador++;
        }
        return contador;
    }
}
