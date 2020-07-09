package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-ApplicationContext.xml");
        // retrieve the bean
        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are same

        boolean compareTwoObjects = (myCoach == alphaCoach);

        System.out.println("The result of comparing two objects: " + compareTwoObjects);
        System.out.println("Memory Location for myCoach: " + myCoach);
        System.out.println("Memory Location for alphaCoach: "+ alphaCoach);

        //close the context
        context.close();
    }
}
