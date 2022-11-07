import java.util.Scanner;

public class AT01 {
        public static void main(String[] arg){

            //inicio dos Objetos
            Scanner sc = new Scanner(System.in);
            //Fim dos Objetivos

            //Inicio das Variáveis
            int value01;
            int value02;
            int result;
            //Fim das Variáveis

            System.out.print("Informe o primeiro número a ser somado: ");
            value01 = sc.nextInt();
            System.out.print("Informe o segundo número a ser somado: ");
            value02 = sc.nextInt();

            System.out.printf("O primeiro valor digitado foi %d e o segundo foi %d", value01, value02);

            result = value01 + value02;

            System.out.printf("%nA soma dos números digitados é: %d", result);
        }
}
