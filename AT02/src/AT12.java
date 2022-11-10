import java.util.Scanner;

public class AT12 {
    public static void main(String[] args){
        //Objeto
        Scanner sc = new Scanner(System.in);

        //VAriáveis
        double x, y;

        System.out.print("Digite um valor: ");
        x = sc.nextDouble();
        System.out.print("Digite outro valor: ");
        y = sc.nextDouble();

        if(x > 0 && y > 0 ){
            System.out.println("Q1");
        } else if (x < 0 && y> 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }else if (x > 0 && y < 0){
            System.out.println("Q4");
        }else {
            System.out.println("Origem");
        }

    }
}
