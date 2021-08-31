import java.util.Scanner;

public class MediaDeN_Numeros {
    public static void main(String[] args) {
        System.out.println("Esse programa exibe a média aritmética de N números digitados pelo usuário");
        System.out.println("Entre com a quantidade de números desejada para o calculo de média: ");
        Scanner teclado = new Scanner(System.in);
        int quantidadeDeNumeros = teclado.nextInt();
        double somaDosNumeros = 0;
        int contador = 0;
        while (contador < quantidadeDeNumeros){
            System.out.println("Digite o número a ser somado: ");
            somaDosNumeros = somaDosNumeros + (somaDosNumeros = teclado.nextDouble());
            contador ++;
        }
        double mediaAritmetica = (somaDosNumeros / quantidadeDeNumeros);

        System.out.println("A média aritmética desses números é: " + mediaAritmetica);

    }
}
