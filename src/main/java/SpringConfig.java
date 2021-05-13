import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Sergey Nesterov
 */

@Configuration
@ComponentScan("..")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
