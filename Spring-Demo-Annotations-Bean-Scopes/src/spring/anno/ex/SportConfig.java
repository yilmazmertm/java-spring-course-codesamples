package spring.anno.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("spring.anno.ex")
public class SportConfig {

    // define a bean for sad fortune
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define a bean for swim coach and inject it
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}