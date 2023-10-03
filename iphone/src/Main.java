import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma ação:");
            System.out.println("1 - Tocar música");
            System.out.println("2 - Pausar música");
            System.out.println("3 - Selecionar música");
            System.out.println("4 - Ligar telefone");
            System.out.println("5 - Exibir página na internet");
            System.out.println("6 - Adicionar nova aba");
            System.out.println("7 - Atualizar página");
            System.out.println("8 - Receber chamada");
            System.out.println("9 - Atender chamada");
            System.out.println("10 - Iniciar correio de voz");
            System.out.println("0 - Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    meuIphone.tocar();
                    break;
                case 2:
                    meuIphone.pausar();
                    break;
                case 3:
                    meuIphone.selecionarMusica();
                    break;
                case 4:
                    meuIphone.ligar();
                    break;
                case 5:
                    meuIphone.exibirPagina();
                    break;
                case 6:
                    meuIphone.adicionarNovaAba();
                    break;
                case 7:
                    meuIphone.atualizarPagina();
                    break;
                case 8:
                    meuIphone.receberChamada();
                    break;
                case 9:
                    meuIphone.atender();
                    break;
                case 10:
                    meuIphone.iniciarCorreioVoz();
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
