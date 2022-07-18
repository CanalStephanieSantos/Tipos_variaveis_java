import static java.lang.System.out;

public class Variaveis {

    //Quando desenvolvemos um programa sempre precisamos armazenar algum valor em memória
    // para utilizar durante o processo de execução do nosso sistema, esses valores podem ser:
    //data, nome e etc, chamamos isso de variaveis

    //As variavies são posições em memória atribuidas em tempo de execução, elas podem ter
    //quatro elementos, mas em java geralmente 3 são suficientes: tipo, nome, valor e tamanho

    //Exemplos:

    float salario = 1.000f;
    int idade = 23;

    public static void main(String[] args) {
        String nome = "Stephanie";
        int idade = 23;

        out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos =)");
    }
}