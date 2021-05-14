import org.springframework.beans.factory.annotation.Value;

/**
 * @author Sergey Nesterov
 */

public class Volume {
    @Value("${defaultVolume}")
    private int volume;

    public void getVolume(){
        System.out.printf("Volume: %d \n", volume);
        volume += 10;
    }
}
