import java.util.Scanner;

public class AT17 {
    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variaveis
        int valorEntrada;

        System.out.print("Digite um número: ");
        valorEntrada = sc.nextInt();

        for (int i = 1; i <= valorEntrada; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
