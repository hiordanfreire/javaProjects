import java.util.Scanner;

public class AT06 {
    public static void main(String[] args){
        //Inicio dos objetos
        Scanner sc = new Scanner(System.in);
        //Fim dos objetos

        //Variáveis
        int number;
        //Fim das variáveis

        System.out.print("Digite um número inteiro positivo ou negativo: ");
        number = sc.nextInt();

        if(number < 0){
            System.out.println("O número digitado é negativo.");
        }else{
            System.out.println("O número digitado não é negativo.");
        }
    }
}