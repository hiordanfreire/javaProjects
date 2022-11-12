import java.util.Scanner;

public class AT15 {
    public static void main(String[] args){
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int coordinateX, coordinateY;
        int coordinateExitX = 0, coordinateExitY = 0;

        System.out.print("Digite a coordenada X: ");
        coordinateX = sc.nextInt();
        System.out.print("Digite a coordenada Y: ");
        coordinateY = sc.nextInt();

        while (coordinateX != coordinateExitX && coordinateY != coordinateExitY){
            if (coordinateX > 0 && coordinateY > 0){
                System.out.println("Primeiro quadrante");
            }else if(coordinateX < 0 && coordinateY > 0){
                System.out.println("Segundo quadrante");
            } else if (coordinateX < 0) {
                System.out.println("Terceiro quadrante");
            }else{
                System.out.println("Quarto quadrante");
            }

            System.out.print("Digite a coordenada X: ");
            coordinateX = sc.nextInt();
            System.out.print("Digite a coordenada Y: ");
            coordinateY = sc.nextInt();


        }

        System.out.println(" ");
    }
}
