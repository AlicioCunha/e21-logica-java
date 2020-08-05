import java.util.Scanner;

public class CalculadoraEntradaDados {
	public static void main (String[] args) {

        /*
            Desenvolver as quatro operações com entrada de dados 
            Com 2 numeros
        */
        int n1;
        int n2;
        int numeroMuitograndeMasDeTamanhoInteiro = 9999999;

        int soma;
        int subtracao;
        int multiplicacao;
        double  divisao;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo valor");
        n2 = sc.nextInt();

        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;

        System.out.println("O resultado da soma e : " + soma);
        System.out.println("O resultado da subtracao e: " + subtracao);
        System.out.println("O resultado da multiplicacao e: " + multiplicacao);
        System.out.println("O resultado da divisao e: " + divisao);




        sc.close();
	}
}