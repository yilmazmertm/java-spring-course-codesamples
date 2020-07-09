package spring.anno.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*
    @Autowired
    public TennisCoach(FortuneService thefortuneService) {
        fortuneService = thefortuneService;
    }
    */
    // define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: default constructor ");
    }

    //define a setter
    /*
    @Autowired
    public void ownCustomMethodName(FortuneService theFortuneService) {
        System.out.println(">> TennisCoach: setFortuneService ");
        fortuneService = theFortuneService;
    }
     */

    @Override
    public String getDailyWorkout() {
        return "Practice tennis, I am the tennis Coach.";
    }

    @Override
    public String getDailyFortune() {
        return "This is TennisCoach, dailyFortune method" + fortuneService.getFortune();
    }
}
