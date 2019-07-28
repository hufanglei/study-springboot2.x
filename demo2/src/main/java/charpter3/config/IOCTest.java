package charpter3.config;

import charpter3.pojo.User;
import charpter3.pojo.User2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest {
    private static Logger logger = LoggerFactory.getLogger(IOCTest.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(charpter3.config.AppConfig.class);
        User2 user = ctx.getBean(User2.class);
        logger.info("========{}",user.toString());
        System.out.println(user.getId());
    }
}
