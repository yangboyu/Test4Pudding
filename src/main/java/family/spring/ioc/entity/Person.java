package family.spring.ioc.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangboyu on 2018/2/13.
 */
//@Component
@Service
//@Resources
public class Person implements InitializingBean, BeanNameAware, BeanFactoryAware {

    private int age;

    private String name;

    private int sex;

    private List<String> addressList;

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }

    public static Person getInstance(){
        return new Person();
    }

    public void init() {

        System.out.println("正在执行初始化：init方法...");

    }


    public void close() {

        System.out.println("正在执行关闭：close方法...");

    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet is called");
    }

//    @Override
    public void work(){
        System.out.println("I am working...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "addressList=" + addressList +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName:" + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory:" + beanFactory);
    }
}