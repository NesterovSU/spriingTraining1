import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    int num;
    String[] songs;
    public void playMusic(MusicGenre musicGenre) {
        System.out.println("\n" + this.toString());
        songs = musicGenre.getMusic().getSongs();
        num = (int) (musicGenre.getMusic().getSongs().length * Math.random());
        System.out.printf("Playing: %s\n", songs[num]);
    }
}
