import java.util.Scanner;

public class AT22 {
    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int integer;

        System.out.print("Digite o número que deseja conhecer seus divisores: " );
        integer = sc.nextInt();

        for (int i=1; i <= integer; i++){
            if (integer % i == 0){
                System.out.println(i);
            }
        }

    }
}
