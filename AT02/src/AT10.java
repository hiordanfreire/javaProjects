import java.util.Scanner;

public class AT10 {
    public static void main(String[] args){
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int cod, qnt;
        double valor = 0;

        System.out.println("Digite o código do lanche: ");
        cod = sc.nextInt();
        System.out.println("Digite quantos lanches irá querer: ");
        qnt = sc.nextInt();

        if (cod == 1){
            valor = qnt * 4.00;
        } else if (cod == 2) {
            valor = qnt * 4.50;
        } else if (cod == 3) {
            valor = qnt * 5.00;
        } else if (cod == 4) {
            valor = qnt * 2.00;
        } else if (cod == 5) {
            valor = qnt  * 1.00;
        }

        System.out.printf("Valor total do lanche: %.2f", valor);

    }
}