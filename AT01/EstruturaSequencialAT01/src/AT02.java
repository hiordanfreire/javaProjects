import java.util.Scanner;

public class AT02 {
    public static void main(String[] args){

        //Inicio dos Objetos
        Scanner sc = new Scanner(System.in);
        //Fim dos Objetos

        //Início das variáveis e constante
        double raio;
        double area;

        //final double pi = 3.14159;
        //Fim das variáveis e constante


        System.out.print("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A area do círculo é %.4f%n", area);
    }
}
