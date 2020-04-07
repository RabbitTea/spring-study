import com.sandra.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        /**
         * 在getBean前，这个对象就已经被创建了；
         */
        //User user = (User)context.getBean("user");

        /**
         * 测试别名
         */
        User user = (User)context.getBean("userNew");

        user.show();
    }

}
