import java.util.Scanner;

public class AT14 {
    public static void main(String[] args){
        //Objeto
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int passwordCorrect = 2002;
        int passwordAttempt;

        System.out.print("Digite sua senha: ");
        passwordAttempt = sc.nextInt();

        while(passwordAttempt != passwordCorrect){
            System.out.println("Senha inválida!");

            System.out.print("Digite sua senha: ");
            passwordAttempt = sc.nextInt();

        }

        System.out.println("Acesso liberado!");

    }
}
