package springdemo;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;

    }

    @Override
    public String getDailyWorkouts() {
        return "Spend 30 min on workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
