import java.util.Scanner;

public class AT08{
    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int num01;
        int num02;

        System.out.println("Digite um número: ");
        num01 = sc.nextInt();
        System.out.println("Digite outro número: ");
        num02 = sc.nextInt();

        if(num01 % num02 == 0 || num02 % num01 == 0){
            System.out.println("São multíplos");
        }else{
            System.out.println("Não são multíplos.");
        }
    }
}