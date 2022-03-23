import entities.Elevador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        byte opc = 0;
        int pes;

        System.out.println("Elevador\n");

        System.out.print("Informe quantos Andares do Prédio: ");
        int totAnd = teclado.nextInt();

        System.out.print("Informe a capacidade do Elevador: ");
        int capacidade = teclado.nextInt();

        System.out.print("Informe quantidade de Pessoas: ");
        int totPes = teclado.nextInt();

        System.out.println();

        Elevador elev = new Elevador(totAnd, capacidade, totPes);

        while (opc < 6) {

            System.out.println("Escolhe uma opção\n");
            System.out.println("1 - Inicializar o Elevador");
            System.out.println("2 - Entrada de Pessoa");
            System.out.println("3 - Saída de Pessoa");
            System.out.println("4 - Subir");
            System.out.println("5 - Descer");
            System.out.println("6 - Sair do Programa");
            opc = teclado.nextByte();

            switch (opc) {
                case 1:
                    elev.inicializa(capacidade, totAnd);
                    break;
                case 2:
                    System.out.print("Informe quantas Pessoas entram no Elevador: ");
                    pes = teclado.nextInt();
                    elev.entra(pes);
                    break;
                case 3:
                    System.out.print("Quantas Pessoas Saiam no Elevador: ");
                    pes = teclado.nextInt();
                    elev.sai(pes);
                    break;
                case 4:
                    elev.sobe();
                    break;
                case 5:
                    elev.desce();
                    break;
                case 6:
                    System.out.println("Programa Encerrado");
                    break;
                default:
                    System.out.println("Opção Errada!!!");
                    break;

            }
        }

    }
}
