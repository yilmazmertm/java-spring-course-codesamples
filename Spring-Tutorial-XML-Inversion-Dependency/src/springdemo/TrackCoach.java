package springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkouts() {
        return "Do a 1 hour of track";
    }

    @Override
    public String getDailyFortune() {
        return "Comin from the TrackCoach class : " + fortuneService.getFortune();
    }

    // add an init
    public void doMyStartup() {
        System.out.println("Inside of the doMyStartup");
    }

    // add an destroy
    public void doMyCleanup(){
        System.out.println("Inside of the doMyCleanup");
    }
}
