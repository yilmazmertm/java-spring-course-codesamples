package spring.anno.ex;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private final String[] data = {
            "Fortune 1", "Fortune 2", "Fortune 3", "Fortune 4"
    };

    private final Random myRandom = new Random();

    @Override
    public String getFortune() {
        int index = myRandom.nextInt(data.length);
        return data[index];
    }
}
