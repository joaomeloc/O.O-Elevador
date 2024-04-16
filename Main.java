import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
      
        System.out.println("Informe a capacidade do elevador: ");
        int capacidade = scanner.nextInt();
        System.out.println("Informe o total de andares do prédio: ");
        int totalAndares = scanner.nextInt();

        Elevador elevador = new Elevador(capacidade, totalAndares);      
         
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Entrar");
            System.out.println("2 - Sair");
            System.out.println("3 - Subir");
            System.out.println("4 - Descer");
            System.out.println("0 - Parar");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    elevador.entrar();
                    break;
                case 2:
                    elevador.sair();
                    break;
                case 3:
                    elevador.subir();
                    break;
                case 4:
                    elevador.descer();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        scanner.close();
    }
}