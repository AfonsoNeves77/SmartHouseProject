package pt.ipp.isep.dei.examples.basic.domain.Bloco3;

public class Exercicio11 {

    public static String gradeIntoString(int nota) {
        String message = "";
        if (nota < 0) {
            message = "Nota inválida";
        } else if (nota <= 4) {
            message = "Mau";
        } else if (nota <= 9) {
            message = "Medíocre";
        } else if (nota <= 13) {
            message = "Suficiente";
        } else if (nota <= 17) {
            message = "Bom";
        } else if (nota <= 20) {
            message = "Muito bom";
        } else {
            message = "Nota não pode ser superior a 20";
        }
        return message;
    }
}

