package family.spring.aop;

import family.spring.aop.entity.Dao;
import family.spring.aop.entity.DaoImpl;
import family.spring.ioc.entity.Person;
import net.sf.cglib.core.DebuggingClassWriter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by yangboyu on 2018/2/13.
 */
public class Test4SpringAop {

    public static void main(String[] args) {
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/yangboyu/work/temp/");
//        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring/aop/applicationContext.xml");
        DaoImpl dao = ac.getBean("daoImpl", DaoImpl.class);
        System.out.println(dao.getClass().getName());
        dao.select();


//        ClassPathResource resource = new ClassPathResource("conf/spring/aop/applicationContext.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        Dao dao = beanFactory.getBean("daoImpl", Dao.class);
//        dao.select();
//
//        TestAnnotationSpringBean testAnnotationSpringBean = context.getBean("testAnnotationSpringBean", TestAnnotationSpringBean.class);
//        testAnnotationSpringBean.getPerson().work();
//        System.out.println(testAnnotationSpringBean.getPerson().toString());

//        context.registerShutdownHook();
//        ClassPathResource resource = new ClassPathResource("conf/spring/ioc/applicationContext.xml");
//        BeanFactory beanFactory = new XmlBeanFactory(resource);
//        Person person1 = beanFactory.getBean("person", Person.class);
//        person1.work();
//
//        Person person2 = beanFactory.getBean("person", Person.class);
//        person2.work();
//
//        System.out.println(person1 == person2);

        //根据Xml配置文件创建Resource资源对象，该对象中包含了BeanDefinition的信息
//        ClassPathResource resource = new ClassPathResource("conf/spring/ioc/applicationContext.xml");
//        //创建DefaultListableBeanFactory
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        //创建XmlBeanDefinitionReader读取器，用于载入BeanDefinition。之所以需要BeanFactory作为参数，是因为会将读取的信息回调配置给factory
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        //XmlBeanDefinitionReader执行载入BeanDefinition的方法，最后会完成Bean的载入和注册。完成后Bean就成功的放置到IOC容器当中，以后我们就可以从中取得Bean来使用
//        reader.loadBeanDefinitions(resource);
//
//        System.out.println(factory.getBeanDefinitionCount());
//        Person person = factory.getBean("person", Person.class);
//        person.work();
    }
}
