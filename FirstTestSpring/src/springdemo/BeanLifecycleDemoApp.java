package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
    public static void main(String[] args) {
        // load the spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-ApplicationContext.xml");
        // retrieve the bean
        Coach myTrackCoach = context.getBean("myTrackCoach", Coach.class);

        // check if they are same
        System.out.println(myTrackCoach.getDailyWorkouts());

        //close the context
        context.close();
    }
}
