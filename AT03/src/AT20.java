import java.util.Scanner;

public class AT20 {
    public static void main(String[] args){
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int numberOfNumbers;
        double dividend, divider, result;

        System.out.println("Digite os números para a divisão: ");
        numberOfNumbers = sc.nextInt();


        for(int i=0; i < numberOfNumbers; i++){

            System.out.println("Digite o dividendo: ");
            dividend = sc.nextDouble();
            System.out.println("Digite o divisor: ");
            divider = sc.nextDouble();


            if(divider == 0){
                System.out.print("Divisão impossível.\n");

            }else {
                result = dividend / divider;
                System.out.printf("O resultado da divisão foi: %.2f \n", result);
            }

        }
    }
}
