package springdemo;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Your fortune is good";
    }
}
