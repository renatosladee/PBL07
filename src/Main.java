import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ebook ebook1 = new Ebook("Sandman", "Neil Gaiman");
        Ebook ebook2 = new Ebook("Deuses Americanos", "Neil Gaiman");

        VideoDigital video1 = new VideoDigital("Good Omens", "Neil Gaiman");
        VideoDigital video2 = new VideoDigital("Coraline", "Neil Gaiman");

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("0 - Sair");
            System.out.println("1 - Ver descrição do Ebook 1");
            System.out.println("2 - Ver descrição do Ebook 2");
            System.out.println("3 - Ver descrição do Vídeo 1");
            System.out.println("4 - Ver descrição do Vídeo 2");
            System.out.println("5 - Baixar Ebook 1");
            System.out.println("6 - Baixar Ebook 2");
            System.out.println("7 - Visualizar Vídeo 1");
            System.out.println("8 - Visualizar Vídeo 2");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println(ebook1.descricao());
                    break;
                case 2:
                    System.out.println(ebook2.descricao());
                    break;
                case 3:
                    System.out.println(video1.descricao());
                    break;
                case 4:
                    System.out.println(video2.descricao());
                    break;
                case 5:
                    ebook1.acao();
                    break;
                case 6:
                    ebook2.acao();
                    break;
                case 7:
                    video1.acao();
                    break;
                case 8:
                    video2.acao();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}