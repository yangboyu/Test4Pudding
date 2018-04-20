package family.spring.aop.advice;

import org.springframework.stereotype.Service;

//@Service("humanServiceImpl")
public class HumanServiceImpl implements IHumanService {

    @Override
    public String login(String username, String passowrd) {
        System.out.println("login username:" + username + ",passowrd:" + passowrd);
//        if (username == null) {
//            throw new NullPointerException("username is null");
//        }
        return "OK";
    }

    @Override
    public String register(String username, String passowrd) {
        System.out.println("register username:" + username + ",passowrd:" + passowrd);
        return "OK";
    }

}