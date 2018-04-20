package family.spring.aop.advice;

/**
 * Created by yangboyu on 2018/3/21.
 */
public interface IHumanService {

    String login(String username, String passowrd);

    String register(String username, String passowrd);
}
