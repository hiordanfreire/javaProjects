import java.util.Scanner;

public class AT19 {
    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int casosTeste;
        double fristNumberAverage, secundNumberAverage, thirdNumberAverage, mediaPonderada = 0;

        System.out.println("Digite a quantidade de casos testes: ");
        casosTeste = sc.nextInt();

        for(int i=0; i < casosTeste; i++){
            System.out.println("Digite os números que deseja descobrir a média ponderada: ");
            fristNumberAverage = sc.nextDouble();
            secundNumberAverage = sc.nextDouble();
            thirdNumberAverage = sc.nextDouble();

            mediaPonderada = (fristNumberAverage * 2 + secundNumberAverage * 3+ thirdNumberAverage * 5) / 10;

            System.out.printf("%.1f\n",mediaPonderada);
        }


    }
}
