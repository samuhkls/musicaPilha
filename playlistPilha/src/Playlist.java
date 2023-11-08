import java.io.IOException;
import java.util.Stack;

public class Playlist {
    private Stack<Musica> musicas=new Stack<Musica>();

    public void adicionar(Musica musica){
        musicas.push(musica);
    }
    public void tocarProximo() {
         Musica x= musicas.peek();
        try {
            Runtime.getRuntime().exec("cmd.exe /C start microsoft-edge:http://www.youtube.com/watch?v=" +x.getCodYT());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void exibirMusicas(){
        for(Musica item : musicas){
            System.out.println(item.getArtista());
            System.out.println(item.getNome());
            System.out.println(item.getCodYT());
        }
    }

}
