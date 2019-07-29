package charpter3.pojo.defination;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class BusinessPerson implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

//    @Autowired(required = true)

    private Animal animal = null;
    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    @Autowired @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.out.println("延迟依赖注入");
        this.animal = animal;
    }
    @Override
    public void setBeanName(String s) {
        System.out.println(this.getClass().getSimpleName() + "  调用beanNameAware的setBeanName");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(this.getClass().getSimpleName() + "  调用BeanFactoryAware的setBeanFactory");
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(this.getClass().getSimpleName() + "  调用ApplicationContextAware的setApplicationContext");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "  调用InitializingBean的afterPropertiesSet");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "  调用DisposableBean的destroy");
    }

    @PostConstruct
    public  void init(){
        System.out.println(this.getClass().getSimpleName() + "  注解@PostConstruct定义的自定义初始方法");
    }

    @PreDestroy
    public void destroy1() throws Exception {
        System.out.println(this.getClass().getSimpleName() + "  注解@PreDestroy定义的自定义销毁方法");
    }

}
