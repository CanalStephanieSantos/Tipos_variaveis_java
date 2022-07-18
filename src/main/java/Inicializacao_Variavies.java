import static java.lang.System.out;

public class Inicializacao_Variavies {

    public static void main(String[] args) {

        byte tamanho = 127;
        short valorCurto = 32767;
        char caracter = 'A';
        float valorPontoFlutuante = 3.4028235E38f;
        double valorPontoFlutuanteMaior = 1.7976931348623157E308;
        int inteiro = 2147483647;
        long inteiroLongo = 9223372036854775807L;
        boolean veradedeiroFalso = true;

        out.println("Valor Byte = " + tamanho);
        out.println("Valor Short = " + valorCurto);
        out.println("Valor Char = " + caracter);
        out.println("Valor Float = " + valorPontoFlutuante);
        out.println("Valor Double = " + valorPontoFlutuanteMaior);
        out.println("Valor Int = " + inteiro);
        out.println("Valor Long = " + inteiroLongo);
        out.println("Valor Booleano = " + veradedeiroFalso);
    }
}
