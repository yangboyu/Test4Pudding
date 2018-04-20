package family.spring.ioc;

import family.spring.ioc.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * Created by yangboyu on 2018/2/27.
 */

@Component
public class TestAnnotationSpringBean {
//    @Resource(name="person")
    @Autowired
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
