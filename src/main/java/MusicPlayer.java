import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private int num;
    private String[] songs;
    @Autowired
    private Volume volume;

    public void playMusic(MusicGenre musicGenre) {
        System.out.println("\n" + this.toString());
        songs = musicGenre.getMusic().getSongs();
        num = (int) (musicGenre.getMusic().getSongs().length * Math.random());
        System.out.printf("Playing: %s\n", songs[num]);
        volume.getVolume();
    }
}
