import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private static final Smartphone smartphone = new Smartphone();

    public static void main(String[] args) {
        int app;
        while (true){
            System.out.println("Escolha uma das opções");
            System.out.println("#####################");
            System.out.println("1 - Reprodutor musical");
            System.out.println("2 - Aparelho telefônico");
            System.out.println("3 - Navegador na internet");
            System.out.println("4 - Sair");
            app = scanner.nextInt();


            if (app == 1) {

                int option;
                while (true) {
                    System.out.println("Escolha uma das opções");
                    System.out.println("#####################");
                    System.out.println("1 - Tocar música");
                    System.out.println("2 - Pausar música");
                    System.out.println("3 - Escolher música");
                    System.out.println("4 - Sair");
                    option = scanner.nextInt();

                    if (option == 1){
                        smartphone.playMusic();
                    }

                    if (option == 2){
                        smartphone.pauseMusic();
                    }

                    if (option == 3) {
                        System.out.println("Escolha uma música para tocar: ");
                        String song = scanner.next();
                        smartphone.chooseMusic(song);

                    }

                    if (option == 4){
                        break;
                    }
                }
            }
            if(app == 2){
                int option;
                while (true) {
                    System.out.println("Escolha uma das opções");
                    System.out.println("#####################");
                    System.out.println("1 - Fazer uma ligação");
                    System.out.println("2 - Atender uma chamada");
                    System.out.println("3 - Abrir correio de voz");
                    System.out.println("4 - Sair");
                    option = scanner.nextInt();

                    if (option == 1){
                        System.out.println("Disque o número: ");
                        int number = scanner.nextInt();

                        smartphone.callNumber(number);
                    }

                    if (option == 2){
                        smartphone.answer();
                    }

                    if (option == 3) {
                        smartphone.voiceMail();
                    }

                    if (option == 4){
                        break;
                    }
                }
            }
            if(app == 3){
                int option;
                while (true) {
                    System.out.println("Escolha uma das opções");
                    System.out.println("#####################");
                    System.out.println("1 - Exibir página");
                    System.out.println("2 - Adicionar nova aba");
                    System.out.println("3 - Atualizar página");
                    System.out.println("4 - Sair");
                    option = scanner.nextInt();

                    if (option == 1){
                        System.out.println("Digite uma URL");
                        String url = scanner.next();

                        smartphone.openPage(url);
                    }

                    if (option == 2){
                        smartphone.addNewTab();
                    }

                    if (option == 3) {
                        smartphone.refreshPage();
                    }

                    if (option == 4){
                        break;
                    }
                }
            }
            if (app == 4){
                break;
            }
        }
    }
}