package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //retrieve bean
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach myTrackCoach = context.getBean("myTrackCoach", Coach.class);

        //call methods on bean
        System.out.println(theCoach.getDailyWorkouts());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(myTrackCoach.getDailyFortune());
        // close on context
        context.close();
    }
}
