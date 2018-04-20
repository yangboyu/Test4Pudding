package family.spring.aop.advice;

import net.sf.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAop {

    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/yangboyu/work/temp/");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring/aop/spring-aop-advice.xml");

        IHumanService userService = ctx.getBean("humanServiceImpl", IHumanService.class);
        //userService.login("ricky", "123");

        userService.login(null, "123456");

//        ctx.close();
    }
}