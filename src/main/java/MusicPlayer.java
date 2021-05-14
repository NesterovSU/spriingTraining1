import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Sergey Nesterov
 */

public class MusicPlayer {
    private int num;
    private String song;
    private Volume volume;
    private List<Music> musicList;

    MusicPlayer(List<Music> musicList, Volume volume){
        this.musicList = musicList;
        this.volume = volume;
    }

    public void playMusic() {
        num = (int) (musicList.size() * Math.random());
        song = musicList.get(num).getSong();
        System.out.printf("Random playing: %s\n", song);
        volume.getVolume();
    }
}
