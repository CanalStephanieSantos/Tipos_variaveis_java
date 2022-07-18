import static java.lang.System.out;

public class Tipo_de_dado {

    //Existem dois tipos de dados: por valor e por referência

    //Os primitivos sempre começam com letra minúscula, eles são do tipo por valor, exemplo:

    boolean verdadeiroFalso = false;
    byte tamanho = 0;
    char caracter = 0;
    short valorCurto = 0;
    int inteiro = 0;
    long inteiroLongo = 0;
    float valorPontoFlutuante = 0;
    double valorPontoFlutuanteMaior = 0;

    //Em todos os casos que você tem um objeto sua variável será uma referência daquele objeto.
    //Exemplo:
    String string = "string";
    Object objeto = "Objeto";

    //Ponto flutuantes:
    //números de ponto flutuante de precisão simples e podem representar até 7 dígitos
    float pontoFlutuanteMenor = 4.333f;

    //As variáveis do tipo double podem representar até 15 dígitos,
    // sendo o dobro da precisão de variáveis float.
    //armazena mais dígitos à direita do ponto de fração decimal
    double pontoflutuanteMaior = 4.800;

    public static void main(String[] args) {
        out.println("Tamanho dos dados: \n" +
                "\nMinimo Byte: " + Byte.MIN_VALUE +
                "\nMaximo Byte: " + Byte.MAX_VALUE +
                "\nMinimo Short: " + Short.MIN_VALUE +
                "\nMaximo Short: " + Short.MAX_VALUE +
                "\nMinimo Int: " + Integer.MIN_VALUE +
                "\nMaximo Int: " + Integer.MAX_VALUE +
                "\nMinimo Long: " + Long.MIN_VALUE +
                "\nMaximo Long:" + Long.MAX_VALUE +
                "\nMinimo Float: " + Float.MIN_VALUE +
                "\nMaximo Float: " + Float.MAX_VALUE +
                "\nMinimo Double: " + Double.MIN_VALUE +
                "\nMaximo Double: " + Double.MAX_VALUE);
    }
}
