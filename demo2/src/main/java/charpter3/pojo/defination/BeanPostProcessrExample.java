package charpter3.pojo.defination;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessrExample implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor 调用 "
        + " postProcessBeforeinitialization 方法，参数 【"
                + bean.getClass().getSimpleName() + "<" + beanName +"】" );
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor 调用 "
                + " postProcessAfterInitialization 方法，参数 【"
                + bean.getClass().getSimpleName() + "<" + beanName +"】" );
        return bean;
    }
}
