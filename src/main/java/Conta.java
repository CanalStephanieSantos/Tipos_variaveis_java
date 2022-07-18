import static java.lang.System.out;

public class Conta {

    //As variaveis de referências são utilizadas para armazenar a localização
    //de objetos na memória do computador.
    //Esses objetos referenciados pode conter variaveis de instância e metodos,
    //para utilizar esses métodos é preciso ter referência do objeto.
    //As variavies de referência são inicializadas com o valor “null”.

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void loginConta(String nome) {
        if (nome.equals("Maria")) {
            out.println("Bem vindo(a) " + nome);
        } else {
            out.println("Usuário não encontrado ! =(");
        }
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNome("Maria");

        out.println(conta);
        out.println(conta.getNome());
        conta.loginConta(conta.getNome());
    }
}
