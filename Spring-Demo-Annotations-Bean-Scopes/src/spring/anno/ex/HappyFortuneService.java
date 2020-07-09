package spring.anno.ex;

import org.springframework.stereotype.Component;
@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "This is FortuneService, getFortune method";
    }
}
