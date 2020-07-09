package spring.anno.ex;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "This is the Database Fortune Service";
    }
}
