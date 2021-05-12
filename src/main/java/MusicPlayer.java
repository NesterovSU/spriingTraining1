import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    public void playMusic(MusicEnum musicEnum) {
        System.out.println("\n" + this.toString());
        System.out.printf("Playing: %s\n", musicEnum.getMusic().getSong()[(int)(Math.random()*3)]);
    }
}
