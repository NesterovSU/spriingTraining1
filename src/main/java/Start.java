import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Sergey Nesterov
 */

public class Start {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(
                SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic();
        musicPlayer.playMusic();

    }
}
