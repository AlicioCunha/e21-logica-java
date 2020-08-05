import java.util.Scanner;

public class TipoPrimitivosVariaveis {
	public static void main (String[] args) {

        /*
            Trabalhando com variaveis do tipo Primitivo
        */
        int n1;
        double n2;
        
        double divisao;        

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo valor");
        n2 = sc.nextDouble();        

        divisao = n1 / n2;

        System.out.println("O resultado da divisao e: " + divisao);

        sc.close();
	}
}