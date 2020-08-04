import java.util.Scanner;

public class EntradaDados {
	public static void main (String[] args) {
        String nome;
        int idade;
        double altura ;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        nome = sc.nextLine();

        System.out.println("Digite a sua idade");
        idade = sc.nextInt();
        
        System.out.println("O meu nome e : " + nome + " e tenho " + idade + " anos");
        System.out.println("O valor de PI " + Math.PI);       

        sc.close();
	}
}