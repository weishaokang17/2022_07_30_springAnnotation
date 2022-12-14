package per.wsk.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import per.wsk.tx.TxConfig;
import per.wsk.tx.UserService;

public class IOCTest_Tx {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);

        userService.insertUser();
        applicationContext.close();
    }
}
