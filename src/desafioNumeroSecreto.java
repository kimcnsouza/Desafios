import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        double numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int tentativas = 0;

        for (tentativas = 0; tentativas < 10; tentativas++) {
            System.out.println("Digite um número entre 1 e 100");
            int numeroDigitado = leitura.nextInt();
            if (numeroDigitado == numeroAleatorio) {
                System.out.println("Você descobriu o número secreto com " + tentativas + " tentativas");
                break;
            } else if (numeroDigitado > numeroAleatorio ) {
                System.out.println("O número secreto é menor que " + numeroDigitado);
            } else {
                System.out.println("O número secreto é maior que " + numeroDigitado);
            }
        }

    }
}
