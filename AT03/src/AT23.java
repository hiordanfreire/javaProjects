import java.util.Scanner;

public class AT23 {

    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int integer, frist, secund, third;

        System.out.println("Digite um número inteiro: ");
        integer = sc.nextInt();

        for (int i=1; i<=integer; i++){
            frist = i;
            secund = i * i;
            third = i * i * i;
            System.out.printf("%d %d %d \n", frist, secund, third);
        }
    }
}
