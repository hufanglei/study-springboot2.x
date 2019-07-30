package charpter3.config;

import charpter3.pojo.defination.Squirrel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTest2 {
    private static Logger logger = LoggerFactory.getLogger(IOCTest2.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);
//       User2 user = ctx.getBean(User2.class);
//        logger.info("========{}",user.toString());
//        System.out.println(user.getId());
//        UserService bean = ctx.getBean(UserService.class);
//        bean.printUser(user);
//        ScopeBean bean1 = ctx.getBean(ScopeBean.class);
//        ScopeBean bean2 = ctx.getBean(ScopeBean.class);
//        System.out.println(bean1==bean2);
        Squirrel bean = (Squirrel) ctx.getBean("squirrel");
        bean.use();
    }
}
