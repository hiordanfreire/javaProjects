import java.util.Scanner;

public class AT06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RENTANGULO;

        System.out.print("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = sc.nextDouble();

        TRIANGULO = (A*C) / 2;
        CIRCULO = 3.14159 * Math.pow(C, 2);
        TRAPEZIO = (A + B) * C / 2;
        QUADRADO = Math.pow(B, 2);
        RENTANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RENTANGULO: %.3f%n", RENTANGULO);


    }
}
