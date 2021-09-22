package injectingLiteralValues;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("literalVal", Coach.class);

        System.out.println(coach.printVal());
    }
}
