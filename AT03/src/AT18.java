import java.util.Scanner;

public class AT18 {
    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int qntNumber, number, numberIn = 0, numberOut = 0;

        System.out.print("Digite a quantidade de número que deseeja verificar: ");
        qntNumber = sc.nextInt();

        for (int i=0; i <qntNumber; i++){
            number = sc.nextInt();

            if (number >= 10 && number <=20){
                numberIn += 1;
            } else {
                numberOut += 1;
            }
        }

        System.out.printf("\n%d in\n", numberIn);
        System.out.printf("%d out", numberOut);
    }
}
