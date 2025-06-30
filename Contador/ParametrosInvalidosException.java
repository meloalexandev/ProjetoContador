import java.util.Scanner;
// Exceção personalizada
public class ParametrosInvalidosException extends Exeception  {
    public ParametrosInvalidosException(String messaString){
        super(message);
    }


}

public class Contador {
    public static void main(String[] args) {
        Scanner terminalScanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmentro");
        int parametroUm = terminal.nextInt();


    System.out.println("Digite o primeiro parâmentro");
        int parametroDois = terminal.nextInt();
        
        try{
            //Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }Catch (ParametrosInvalidosException exception){
            //Imprimir a mensagem de erro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro ");

        }

          
    }

    
}

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    if (parametroUm > parametroDois) {
     throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

    }

    int contagem = parametroDois - parametroUm;

    //Realizar for para imprimir os números com base na variável contagem
    for (int i = 1; i <= contagem;  i++ ) {
        System.out.println("Imprimindo o número " + i);

    }


}