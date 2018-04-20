package family.spring.aop.interceptor;

/**
 * Created by yangboyu on 2018/3/21.
 */
public interface UserService {

    String login(String username, String passowrd);

    String register(String username, String passowrd);
}
