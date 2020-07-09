package spring.anno.ex;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "This is the REST Fortune Service";
    }
}
