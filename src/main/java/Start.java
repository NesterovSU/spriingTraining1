import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(
                SpringConfig.class);

    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    musicPlayer.playMusic(MusicGenre.CLASSICALMUSIC);
    musicPlayer.playMusic(MusicGenre.CLASSICALMUSIC);
    musicPlayer.playMusic(MusicGenre.POPMUSIC);
    musicPlayer.playMusic(MusicGenre.POPMUSIC);
    }
}
