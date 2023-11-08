import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Musica musica = new Musica();

        Scanner ler = new Scanner(System.in);

        int numero;

        do{
            System.out.println("Escolha uma funcao de 0 a 4: ");
            System.out.println("1. Adicionar musica");
            System.out.println("2. Tocar próxima");
            System.out.println("3. Listar músicas");
            System.out.println("0. sair ");
            numero = ler.nextInt();
            switch (numero){
                case 1:
                    ler.nextLine();
                    Musica musica1 = new Musica();
                    System.out.println("digite o nome do Artista: ");
                    musica1.setArtista(ler.nextLine());
                    System.out.println("digite o nome da Música: ");
                    musica1.setNome(ler.nextLine());
                    System.out.println("copie a url da musica: ");
                    musica1.setCodYT(ler.nextLine());
                    playlist.adicionar(musica1);
                    break;
                case 2:
                    playlist.tocarProximo();
                    break;
                case 3:
                    playlist.exibirMusicas();
                    break;
            }
        } while (numero!=0);
    }
}
