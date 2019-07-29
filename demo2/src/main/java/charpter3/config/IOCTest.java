package charpter3.config;

import charpter3.pojo.User2;
import charpter3.pojo.defination.BusinessPerson;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
    private static Logger logger = LoggerFactory.getLogger(IOCTest.class);

    @Test
    public  void ma111in(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(charpter3.config.AppConfig.class);
        User2 user = ctx.getBean(User2.class);
        logger.info("========{}",user.toString());
        System.out.println(user.getId());
    }

//    @Test
//    public  void main2(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(charpter3.config.AppConfig.class);
//        BusinessPerson person = ctx.getBean(BusinessPerson.class);
//        person.service();
//
//    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(charpter3.config.AppConfig2.class);
        BusinessPerson person = ctx.getBean(BusinessPerson.class);
        person.service();
        ctx.close();
    }

}
