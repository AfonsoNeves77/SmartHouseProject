package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class Exercicio9 {
    public static String classificacaoProdutos(int codigo) {
        if (codigo < 1 || codigo > 15) {
            return "Código inválido";
        } else if (codigo == 1) {
            return "Alimento não perecível";
        } else if (codigo <= 4) {
            return "Alimento perecível";
        } else if (codigo <= 6) {
            return "Vestuário";
        } else if (codigo == 7) {
            return "Higiene Pessoal";
        }
        return "Limpeza e utensílios domésticos";
    }
}
