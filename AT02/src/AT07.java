import java.util.Scanner;

public class AT07 {
    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);
        //Fim dos Objetos

        //Variaveis
        int number;
        //Fim das veriáveis

        System.out.print("Digite um número para saber se é IMPAR ou PAR: ");
        number = sc.nextInt();

        if(number % 2 == 0){
            System.out.print("Número é PAR.");
        }else{
            System.out.println("Número é IMPAR.");
        }
    }
}
