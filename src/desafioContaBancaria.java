import java.util.Scanner;

public class desafioContaBancaria {
    public static void main(String[] args) {

        String nome = "Joana";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        int opcaoDigitada = 0;
        double valorDigitado = 0;

        String opcoes = """
                Opções:
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
        System.out.println("**************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo Inicial: R$" + saldo);
        System.out.println("\n**************************");

        Scanner leitura = new Scanner(System.in);

        while (opcaoDigitada != 4) {
            System.out.println("\n" +
                               opcoes);
            opcaoDigitada = leitura.nextInt();

            if (opcaoDigitada == 1){
                System.out.println("Saldo: " + saldo);
            }else if (opcaoDigitada == 2) {
                System.out.println("Digite o valor recebido: ");
                valorDigitado = leitura.nextDouble();
                saldo += valorDigitado;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcaoDigitada == 3) {
                System.out.println("Digite o valor que deseja transferir: ");
                valorDigitado = leitura.nextDouble();
                while (valorDigitado > saldo) {
                    System.out.println("*************ALERTA*************");
                    System.out.println("Valor digitado é menor que saldo!");
                    System.out.println("\nDigite um novo valor: ");
                    valorDigitado = leitura.nextDouble();
                }
                saldo -= valorDigitado;
                System.out.println("Novo saldo: " + saldo);

            } else if (opcaoDigitada >= 5) {
                System.out.println("Opção Inválida!");
            } else {
                System.out.println("Consulta finalizada!!");
                break;
            }
        }
    }
}
