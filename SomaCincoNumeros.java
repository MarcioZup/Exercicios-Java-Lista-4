import java.util.Scanner;

public class SomaCincoNumeros {
    public static void main(String[] args) {
        System.out.println("este programa lê cinco números e exibe a soma deles");
        System.out.println("Digite o primeiro número: ");
        Scanner teclado = new Scanner(System.in);
        double primeiroNumero = teclado.nextDouble();
        System.out.println("Digite o segundo número: ");
        double segundoNumero = teclado.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double terceiroNumero = teclado.nextDouble();
        System.out.println("Digite o quarto número: ");
        double quartoNumero = teclado.nextDouble();
        System.out.println("Digite o quinto número: ");
        double quintoNumero = teclado.nextDouble();
        double somaDosNumeros = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero + quintoNumero);
        System.out.println("A soma dos cinco números digitados é " + somaDosNumeros);

        teclado.close();
    }
}
