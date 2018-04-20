package family.entity;

/**
 * Created by yangboyu on 17/3/23.
 */
public class HelloWorld {
    private String message;

    private String welcome;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    public void getWelcome() {
        System.out.println("Your Welcome : " + welcome);
    }

    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean will destroy now.");
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                ", welcome='" + welcome + '\'' +
                '}';
    }
}
