package springdemo;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    private String emailAdress;

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        System.out.println("Inside of the email adress setter");
        this.emailAdress = emailAdress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside of the email team setter");
        this.team = team;
    }

    private String team;

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    //no - arg constructor
    public CricketCoach() {
        System.out.println("Inside of the Cricket Coach Constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside of the Cricket Coach Setter");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkouts() {
        return "This is coming a WORKOUT comin from CricketClass";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
