import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Nesterov
 */

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public RockMusic rockMusicBean(){
        return new RockMusic();
    }
    @Bean
    public PopMusic popMusicBean(){
        return new PopMusic();
    }
    @Bean
    public ClassicalMusic classicalMusicBean(){
        return new ClassicalMusic();
    }
    @Bean
    public List<Music> musicListBean(){
        return new ArrayList<>(List.of(
                popMusicBean(),
                rockMusicBean(),
                classicalMusicBean()));
    }
    @Bean
    public Volume volumeBean(){
        return new Volume();
    }

    @Bean
    public MusicPlayer musicPlayerBean(){
        return new MusicPlayer( musicListBean(), volumeBean());
    }
}
