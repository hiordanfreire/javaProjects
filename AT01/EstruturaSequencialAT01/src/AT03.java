import java.util.Scanner;

public class AT03 {

    public static void main(String[] args){
        //Inicio dos Objetos
        Scanner sc = new Scanner(System.in);
        //Fim dos Objetos

        //Inicio das variáveis
        int A, B, C, D, Diferenca;
        //Fim das variáveis

        System.out.print("Digite o primero valor: ");
        A = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        B = sc.nextInt();
        System.out.print("Digite o terceiro valor: ");
        C = sc.nextInt();
        System.out.println("Digite o quarto valor: ");
        D = sc.nextInt();

        Diferenca = (A  * B - C* D);

        System.out.printf(" A diferença do produto de A e B pelo produto de C e D é: %d%n", Diferenca);

    }

}
