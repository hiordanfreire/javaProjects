import java.util.Scanner;

public class AT16 {
    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int alcool = 0, gasolina = 0, diesel = 0, tipo;

        System.out.print("Digite qual o combustível abastecido: ");
        tipo = sc.nextInt();

        while (tipo != 4){
            if (tipo == 1){
                alcool += 1;
            } else if (tipo == 2) {
                gasolina += 1;
            }else {
                diesel += 1;
            }

            System.out.print("Digite qual o combustível abastecido: ");
            tipo = sc.nextInt();

        }
        System.out.print("\nMUITO OBRIGADO!\n");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
    }
}
