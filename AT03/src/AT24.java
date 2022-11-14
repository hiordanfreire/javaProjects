import java.util.Scanner;

public class AT24 {
    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis
        double celsius, fahrenheit;
        char resposta;

        do {
            System.out.print("Digite a temperatura em Celcius: ");
            celsius = sc.nextDouble();

            fahrenheit = (9 * celsius / 5) + 32;
            System.out.printf("O equivalente em Fahrenheité: %.2f\n", fahrenheit);

            System.out.println("\nDeseja continuar a converter? (S/N)");
            resposta = sc.next().charAt(0);
        }while (resposta != 'n');
    }
}
