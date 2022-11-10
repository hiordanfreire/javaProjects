import java.util.Scanner;

public class AT09 {
    public static void main(String[] args){
        //Objetos
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int horaInicial, horaFinal, tempoJogo;

        System.out.println("Digite a hora inicial do jogo: ");
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora em que parou de jogar: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal){
            tempoJogo = horaFinal - horaInicial;

        }else{
            tempoJogo = 24 - horaInicial + horaFinal;
        }

        System.out.printf("O tempo de jogo foi %d HORA(S)", tempoJogo);
    }
}
