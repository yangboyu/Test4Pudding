package family.spring.aop.interceptor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAop {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("conf/spring/aop/spring-aop-xml.xml");

        UserService userService = (UserService) ctx.getBean("userService");
        //userService.login("ricky", "123");

        userService.login(null, "123456");

        ctx.close();
    }
}