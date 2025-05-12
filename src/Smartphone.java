import java.util.Scanner;

public class Smartphone implements MusicPlayer, Telephone, Browser{

    Scanner scanner = new Scanner(System.in);
    String song = " ";
    boolean playing = false;

    @Override
    public void playMusic() {
        System.out.println("O iPhone está reproduzindo música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O iPhone pausou a música");
    }

    @Override
    public void chooseMusic(String song) {
        System.out.println("Selecionando música...");
        System.out.println("A música foi selecionada no reprodutor");
    }

    @Override
    public void callNumber(int number) {
        System.out.println("Ligando para " + number);
    }

    @Override
    public void answer() {
        System.out.println("Atendendo uma ligação...");
    }

    @Override
    public void voiceMail() {
        System.out.println("Abrindo Correio de voz...");
    }

    @Override
    public void openPage(String url) {
        System.out.println("Abrindo a página " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando a página...");
    }
}
