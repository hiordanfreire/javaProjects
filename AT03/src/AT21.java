import java.util.Scanner;

public class AT21 {

    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int factorial, result = 1;

        System.out.print("Digite o número que deseja descobrir seu fatorial: ");
        factorial = sc.nextInt();

        for (int i=1; i <= factorial; i++ ){
            result *= i ;
        }
        System.out.println(result);
    }
}
