package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // retrieve bean
        CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
        // call the methods
        System.out.println(cricketCoach.getDailyWorkouts());
        System.out.println(cricketCoach.getDailyFortune());

        System.out.println("E-mail adresi ayarlanıyor.");
        System.out.println(cricketCoach.getEmailAdress());
        System.out.println("Takım ismi ayarlanıyor.");
        System.out.println(cricketCoach.getTeam());
        // close the context
        context.close();
    }
}
