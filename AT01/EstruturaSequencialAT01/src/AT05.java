import java.util.Scanner;

public class AT05 {
    public static void main(String[] args){
        //Inicio dos Objetos
        Scanner sc = new Scanner(System.in);
        //Fim dos Objetos

        //Início das variáveis
        int num1, num2;
        double valor1, valor2, totalPagar;
        //Fim das variáveis

        System.out.print("Digite o código da peça: ");
        sc.nextInt();
        System.out.print("Digite o número de peças: ");
        num1 = sc.nextInt();
        System.out.print("Digite o valor da unidade de cada peça: ");
        valor1 = sc.nextDouble();

        System.out.print("Digite o código da peça: ");
        sc.nextInt();
        System.out.print("Digite o número de peças: ");
        num2 = sc.nextInt();
        System.out.print("Digite o valor da unidade de cada peça: ");
        valor2 = sc.nextDouble();

        totalPagar = (num1 * valor1) + (num2 * valor2);

        System.out.printf("O total a pagar é: %.2f",totalPagar);

    }
}
