package spring.anno.ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("Are they pointing the same object : " + result);

        System.out.println("Memory location for theCoach : " + theCoach);

        System.out.println("Memory location for alphaCoach : " + alphaCoach + "\n");


    }
}
