package family.spring.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by yangboyu on 2018/2/28.
 */
public class Test4BeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(
            ConfigurableListableBeanFactory configurableListableBeanFactory)
            throws BeansException {
        System.out.println("******调用了BeanFactoryPostProcessor");
        String[] beanStr = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanName : beanStr) {
            if ("person666".equals(beanName)) {
                BeanDefinition beanDefinition = configurableListableBeanFactory
                        .getBeanDefinition(beanName);
                System.out.println(beanDefinition);
                MutablePropertyValues m = beanDefinition.getPropertyValues();
                if (m.contains("name")) {
                    m.addPropertyValue("name", "赵四");
                    System.out.println("》》》修改了name属性初始值了");
                }
            }
        }
    }

}
