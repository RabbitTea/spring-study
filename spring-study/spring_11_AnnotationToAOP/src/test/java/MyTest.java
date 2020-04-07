import com.sandra.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /**
         * 【重点】动态代理代理的是接口，这里不要写实现类
         */
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }
}
