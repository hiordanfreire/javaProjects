import java.util.Scanner;

public class AT04 {
    public static void main(String[] args){
        //Início dos Objetos
        Scanner sc = new Scanner(System.in);
        //Fim dos Objetos

        //Início das variáveis
        int numberFuncionarios;
        double  qntHorasTrabalhadas, valorHorasTrabalhadas, salario;
        //Fim das variáveis

        System.out.print("Digite o número do funcionário: ");
        numberFuncionarios = sc.nextInt();
        System.out.print("Digite a quantas horas foram trabalhadas: ");
        qntHorasTrabalhadas = sc.nextDouble();
        System.out.print("Digite o valor das horas trabalhada: ");
        valorHorasTrabalhadas = sc.nextDouble();

         salario = valorHorasTrabalhadas * qntHorasTrabalhadas;

        System.out.printf("Número do funcionário: %d%n", numberFuncionarios);
        System.out.printf("O salário que o funcionário receberá é: %.2f%n", salario);

    }
}